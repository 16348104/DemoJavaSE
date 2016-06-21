/**
 * Created by mingfei.net@gmail.com
 * 2016/6/21 14:54
 */
public class IfTest {
    public static void main(String[] args) {
        int score = 50;
        if (score >= 85) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else if (score >= 60) {
            System.out.println("C");
        }

//        String s = (score >= 60)?"passed.":"failed.";
        String s;
        if (score >= 60) {
            s = "passed";
        } else {
            s = "failed";
        }
        System.out.println(s);
    }
}
