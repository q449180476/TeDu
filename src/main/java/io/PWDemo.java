package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符输出流
 * java.io.BufferedWriter
 * 内部有缓冲区，可以块写文本数据来加快写出数据素的。
 *
 * java.io.PrintWriter
 * 具有自动行刷新的缓冲字符输出流，内部总是连接BufferedWriter作为其
 * 缓冲功能
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向pw.txt文件中写入字符串
        /*
            PW提供了直接对文件做操作的构造方法
            PrinWriter(String path)
            PrinWriter(File file)
         */
        PrintWriter pw=new PrintWriter("pw.txt","UTF-8");
        pw.println("无论你是谁的天空，");
        pw.println("今夜你是我的英雄");
        System.out.println("写出完毕");
        pw.close();
    }
}
