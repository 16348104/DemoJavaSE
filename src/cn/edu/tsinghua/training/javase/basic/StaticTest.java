package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/28.
 */
public class StaticTest {
    private int i;
    private static String s;

    public static void method() {
        // ...
    }

    public static void main(String[] args) {
        StaticTest staticTest1 = new StaticTest();
        staticTest1.i = 1;
        StaticTest.s = "hello";
        System.out.println(staticTest1.i);
        System.out.println(StaticTest.s);

        StaticTest staticTest2 = new StaticTest();
        System.out.println(staticTest2.i);
        System.out.println(StaticTest.s);

    }
}
