package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s); // hello
        test(s);
        System.out.println(s); // ? hello hellotest
    }

    public static void test(String s) {
        s += "test"; // s = s + "test";
        System.out.println(s); // hellotest
    }
}
