package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后要求用户输入一个文件名，然后对该文件进行写操作。
 * 之后用户在控制台输入的每一行字符串都写入到该文件中。（不考虑换行问题）
 * 当用户单独输入“exit”时程序推出
 */
public class Note {
    public static void main(String[] args) throws IOException {
        System.out.println("请输入文件名");
        Scanner input = new Scanner(System.in);
        String fileName = input.next();
        RandomAccessFile raf = new RandomAccessFile(fileName + ".txt", "rw");
        System.out.println("请输入你想编写的内容（输入exit退出）");
        while (true) {
            fileName = input.next();
            if ("exit".equals(fileName)) //养成习惯，long不能调用equals方法，会引发空指针异常
            {
                break;
            }
            byte[] data = fileName.getBytes("utf-8");
            raf.write(data);

        }
        System.out.println("书写完毕");
    }
}
