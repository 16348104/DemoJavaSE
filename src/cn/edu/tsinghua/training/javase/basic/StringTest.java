package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class StringTest {

    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String("hello");

        System.out.println(s);
        System.out.println(s1);

        System.out.println(s == s1);

        System.out.println(s.equals(s1));
    }
}
