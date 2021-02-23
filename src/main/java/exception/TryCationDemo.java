package exception;

/**
 * 异常处理机制中的try-catch
 */
public class TryCationDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {

//            String str = null;
//            String str="";
            String str="abc";
        /*
            若果str为null时，当虚拟机执行到下面的代码会发现这里存在
            空指针现象，于是虚拟机会实例化一个空指针异常的实例额，如果
            没有则会将该异常抛出到当前方法外面，由调用该方法的代码
            去解决（这里相当与抛出到main方法外面）。
         */
            System.out.println(str.length());
            System.out.println(str.charAt(0));//获取当前字符串中某一个位置上的字符
            System.out.println(Integer.parseInt(str));//将字符串内容转成整数
            //try语句块中报错代码以下内容都不会被执行！！！
            System.out.println("!!!!!!!!!!!!!!!!");
            //catch用来捕获try中出现的指定异常并予以解决
        }catch(NullPointerException e){
            System.out.println("出现了空指针");
            //catch可以定义多个，当try中不同异常有不同处理方式时可以分别捕获
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("字符串下标越界");
            /*
                catch超类异常的意义：
                当try中某几类异常希望使用相同处理办法时，可以catch这些异常的超类。
                在最后一个catch处捕获Exception也可以避免因为一个未处理
                的异常导致程序中断。

                当多个catch的异常之间存在继承关系时，子类型异常要在
                上面先行捕获，超类异常在下。否则编译不通过。
             */
        }catch(Exception e){
            System.out.println("反正就是出了个错");
        }
        System.out.println("程序结束了");
    }
}

