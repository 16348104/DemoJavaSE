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

        System.out.println((x==y)|(y++>x));
        System.out.println(y);
    }
}
