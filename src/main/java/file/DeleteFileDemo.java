package file;

import java.io.File;

/**
 * 删除一个文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //将test.txt文件删除
        File file=new File("test.txt");//相对路径中./可以省略，默认从./开始
        if(file.exists()){
            file.delete();
            System.out.println("该文件已删除");
        }else{
            System.out.println("该文件不存在");
        }

    }
}
