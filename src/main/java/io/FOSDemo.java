package io;

import java.io.*;

/**
 * java标准的IO，可以用相同的读写方式读写不同的设备。
 * java将IO比喻为“流”，可以理解为是连接程序与设备之间的“管道”，管道
 * 里边是按照同一个方向顺序流动的字节
 *
 * java将流的方向划分为两个操作
 * 输入：用来读取，是从设备到程序的方向，是获取的数据使用的。
 * 输出：用来写入，是从程序到设备的方向，用来发送数据使用的。
 *
 * java.io.InputStream是所有字节输入流的超类，里边定义了读取字节的方法
 * java.io.OutputStream是所有字节流输出流的超类，定义了写出字节的方法
 *
 * java将流分为两类：节点流和处理流
 * 节点流：也称为低级流，是实际连接程序与设备的管道，负责实际读取字节的流
 *        读写一定是建立在节点流的基础上进行的。操作不同的设备有对应的
 *        低级流。例如读写文件有文件流。
 * 处理流：也称为高级流，不能独立存在，必须连接在其他流上，目的是当数据
 *        “流经”当前流时对其做某些加工处理，简化我们的操作。
 * 实际开发中我们总是会串联一组高级流最终连接到低级流上，在数据进行读写
 * 的过程中对数据做流水线式的加工处理，这也成为流连接，也是IO的精髓。
 *
 *
 * 文件流
 * 文件流是一对低级流，用于读写文件的流，功能上与RandomAccessFile一致
 * java.io.FileInputStream和FileOutputStream
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /*
               文件输出流构造方法：
               FileOutputStream（String path）
               FileOUtputStream（File file）
               以上两种构造器创建的文件流为覆盖写模式。
               即创建文件流时如果指定的文件已经存在，则会将该文件内容清空。
               然后使用这个流写出的数据会顺序写入文件作为新数据保存。
               注：RAF则是从头开始写多少覆盖多少

               文件流重载的构造方法
                FileOutputStream（String path，boolean append）
               FileOUtputStream（File file，boolean append）
               如果第二个参数指定，并且指定的值为true时，则当前文件流为
               追加模式，即：创建文件流时如果文件存在，那么文件原有数据保留
               通过这个流写入的数据都会被追加到文件中。
               文件流做不到修改文件的一部分内容，灵活度不如RandomAccessFile
         */
//        RandomAccessFile fos=new RandomAccessFile("fos.txt","rw");//覆盖原本的字节
        FileOutputStream fos=new FileOutputStream("fos.txt",true);//将原来内容全删了在写入，而不是写一次删一次
        String  line="下一次我们会在某个路口相遇";
//        byte[] data=line.getBytes("UTF-8");
//        fos.write(data);
//        line="若即若离，似雨琉璃";
//        fos.write(line.getBytes("UTF-8"));
        fos.write("天地混荒".getBytes("UTF-8"));
        fos.write("今夜你是我的英雄".getBytes("UTF-8"));//不给字符集用的是项目默认的字符集

        System.out.println("写出完毕");
        fos.close();
    }
}
