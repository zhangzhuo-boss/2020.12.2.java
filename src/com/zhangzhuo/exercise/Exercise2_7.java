package exercise;
//将Incrementable的代码改写为一个完整的可运行程序，
public class Exercise2_7 {
    static class StaticTest{
    static int i=47;
}
    static void incrementable(){
        StaticTest.i++;
        //下划线为什么是绿色的
    }
    public static void main(String[] args){
        Exercise2_7.incrementable();
        incrementable();
        incrementable();
        incrementable();
        incrementable();
        incrementable();
        System.out.println("StaticTest.i="+StaticTest.i++);
    }
}

