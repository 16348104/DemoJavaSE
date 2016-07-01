package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = "hi";
        char[] chars = {'a', 'b', 'c', 'd'};
        String s2 = new String(chars);
        System.out.println(s2);

        for (int i = 0; i < s2.length(); i++) {
            System.out.println(s2.charAt(i));
        }
    }
}
