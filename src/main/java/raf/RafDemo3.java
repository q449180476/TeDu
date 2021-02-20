package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型数据，以及RAF指针的作用
 */
public class RafDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");
        //获取RAF指针的位置，默认从0开始
        long pos=raf.getFilePointer();
        System.out.println(pos);
        /*
        向文件中写入一个int最大值
        int最大值的二进制：
        01111111 11111111 11111111 11111111

        imax>>>24
        00000000 00000000 00000000 01111111
        raf.dat文件数据：
        11111111
        */
        int imax=Integer.MAX_VALUE;
        raf.write(imax>>>24);
        raf.write(imax>>>16);
        raf.write(imax>>>8);
        raf.write(imax);
        /*
            RAF提供了方便写出基本类型数据的方法
         */
        raf.writeInt(imax);//连续写4字节，将int值写出，等同上面4句代码
        raf.writeLong(123L);
        raf.writeDouble(123.123);
        System.out.println("写出完毕");
        System.out.println(raf.getFilePointer());//输出现在指针的位置
        raf.seek(0);
        int d=raf.readInt();
        System.out.println(d);
        System.out.println(raf.getFilePointer());
        //读取long值
        raf.seek(8);
        long c=raf.readLong();
        System.out.println(c);
        System.out.println(raf.getFilePointer());
        //读取double值
        double a=raf.readDouble();
        System.out.println(a);
        //修改raf.dat文件中long所在位置的值改为456
        //1.将指针移动到long值得开始位置
        raf.seek(8);
        //2.重新写入新的long值来覆盖原有数据
        raf.writeLong(456L);
        raf.seek(8);
        c=raf.readLong();
        System.out.println(c);




        raf.close();
    }
}
