package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

/**
 * 向文件中写入文本数据
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
        /*
            常见的支持中文的字符集：
            GBK：国标编码，其中英文是1字节，所有中文2字节
            UTF-8：万国码，其中英文1字节，中文3字节（常用这个）
         */
        String str="落叶繁华未尽，琉璃追逐幻影。";
         /*
            String提供的方法:
            byte[] getBytes(String csn)
            将当前字符串内容按照指定的字符集转换为一组字节
            注：字符集名字大小写无所谓，不要拼错！
            该方法要求必须处理：UnsupportedEncodingException异常
            当指定的字符集名字不对时会抛出该异常
         */
        byte[] data=str.getBytes("utf-8");
        raf.write(data);
        str="今夜你是我的英雄";
        data=str.getBytes("utf-8");
        raf.write(data);
        System.out.println("写出完毕");
        raf.close();


    }
}
