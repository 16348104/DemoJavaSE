package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/21 9:25
 */
public class Operator {
    public static void main(String[] args) {
        int x = 99;
        double y = 100;
        boolean z = ++x != y;

        String s1 = "hi";
        String s2 = "hi";

        z = s1 == s2;
        System.out.println(z);

        double a = x + y;
        System.out.println("100" + "xyz");

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(!b2); // 异或

        System.out.println(x);
        System.out.println(y);

        System.out.println((x == y) | (y++ > x));
        System.out.println(y);

        int i = 1;
        i %= 100; // i = i + 100;
        System.out.println(i);

        b1 ^= true;
        System.out.println(b1);

        System.out.println(x);
        System.out.println(y);
        double b = (x < y) ? (x + y) : (x - y);
        System.out.println(b);

        float f = (float) 3.14;

        char c1 = 1;
        int c2 = c1;
        System.out.println((int) c1);

        int d = (2 * 3 / 5) + (2 * 3 / 4 % 5); // 可读性强
        System.out.println(d);
    }
}
