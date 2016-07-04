package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class StringTest {

    public static void main(String[] args) {
        String s = "hello";
        String s1 = "hello";

        System.out.println(s);
        System.out.println(s1);

        System.out.println(s == s1);

        System.out.println(s.equals(s1));

        System.out.println(s.indexOf('l'));

        System.out.println(s.isEmpty());

        System.out.println(s.matches("[A-z]+")); // regex regular expression 正则表达式

        System.out.println(s.replace('l', 'a'));
        System.out.println(s.replace("he", "ab"));
        System.out.println(s.replaceAll("[A-z]+", "123"));

        String s2 = "he ll o";
        String[] strings = s2.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
