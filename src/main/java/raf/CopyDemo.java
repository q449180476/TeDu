package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
        复制原理：从源文件中顺序读取每个字节并写入到另一个文件中
         */
        RandomAccessFile src=
                new RandomAccessFile("image.jpg","r");
        RandomAccessFile desc=
                new RandomAccessFile("image_cp.jpg","rw");
        int d;//用来记录每次读取到的字节
        long start=System.currentTimeMillis();//获取当前系统时间的毫秒值
        while((d = src.read())!=-1) {
            desc.write(d);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制完毕！耗时"+(end-start)+"ms");
        src.close();
        desc.close();
    }
}
