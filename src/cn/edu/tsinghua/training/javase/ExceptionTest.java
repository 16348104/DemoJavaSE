package cn.edu.tsinghua.training.javase;

/**
 * Created at 221
 * 16-7-6 下午2:03.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        String[] strings = {};
        String s = "hi";
        // ...
        try {
            System.out.println(x / y);
            System.out.println(strings[0]);
            System.out.println(s.charAt(2));
        } catch (ArithmeticException e) {
            // ...
        }

        System.out.println("test...");
    }
}
