package exercise;
//便是一些程序，让他含有storage()方法的代码段，并调用它
public class Exercise2_6 {
    public static String s="Hello,World";
    static int storage(String s) {
        return s.length() * 2;}

    public static void main(String[] args){
            System.out.println("storage(s)=" + storage(s));
            //
        }

    }
//无法从静态上下文中引用非静态解决方法，将方法改为静态之后再在public后面加上static