package io;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("fos.txt");
        byte[] data=new byte[1000];//fis.available()预估能得到多少数据，不能断定发多少数据
        int len=fis.read(data);
        System.out.println("实际读取的字节"+len+"字节");
        /*
            将给定的字节数组从下表offset处的连续len个字节按照UTF-8
            编码转换为字符串。
         */
        String line=new String(data,0,len,"UTF-8");
        System.out.println(line);
        System.out.println(line.length());
        fis.close();
    }
}

