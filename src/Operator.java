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
    }
}
