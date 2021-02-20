package file;

import java.io.File;

/**
 * jaav.io.file可以表示硬盘上的一个文件或目录
 * 使用File可以：
 * 1：访问该文件或目录的属性信息（大小，修改日期，可读可写等）
 * 2：创建或删除文件和目录
 * 3：访问一个目录中的所有子项
 * 但是File不能访问文件中的数据
 * java中/是转义字符，linux中支持/，不支持\\（反斜杠）
 */
public class FileDemo {
    public static void main(String[] args){
        /**
         * File创建时可以指定路径
         * 该路径通常使用相对路径
         * 相对路径中“。/”表示当前目录，当前目录具体是哪里要视当前程序的运行环境而定。、
         * 在idea或eclipse里运行时，当前目录就是这个程序所在的项目目录。
         * File file=new File("D:/ideaworkspeace/JSD2012_SE/demo.txt");绝对路径，跨平台性不好，尽可能屏蔽掉系统差异*/
        File file=new File("./demo.txt");//当前目录，更好的跨平台性
        String name=file.getName();
        System.out.println(name);

        long len=file.length();
        System.out.println(len+"字节");

        boolean cr=file.canRead();//可读
        System.out.println(cr);
        boolean cw=file.canWrite();//可写
        System.out.println(cw);
        boolean ih=file.isHidden();
        System.out.println("是否隐藏："+ih);


    }
}
