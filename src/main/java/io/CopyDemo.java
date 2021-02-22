package io;

import com.sun.javaws.IconUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
            1：创建文件流输入读取源文件
            2：创建文件流输出写入复制文件
            3：循环块读写完成复制
            4：关闭两个流
         */
        FileInputStream fis=new FileInputStream("fos.txt");
        FileOutputStream fos=new FileOutputStream("newfis.txt");
        int len;
        byte[] data=new byte[1024*10];
        while((len=fis.read(data))!=-1) {
            fos.write(data,0,len);

        }
        System.out.println("复制完毕！");
        fis.close();
        fos.close();



    }
}
