package exercise;
//编写一个程序，展示无论你创建了某个特定类中的多少个对象，这个类中的某个特定的static域只有一个实例。
public class Exercises2_8 {
    static int i=50;
    public static void main(String[] args){
        Exercises2_8 a=new Exercises2_8();
        Exercises2_8 b=new Exercises2_8();
        Exercises2_8 c=new Exercises2_8();
        System.out.println(a.i+"=="+a.i);
        a.i++;
        System.out.println(a.i+"=="+b.i);
        c.i++;
        System.out.println(a.i+"=="+c.i);
    }
}
//域的值会发生变化，与最后赋值相同，（单例工厂）。