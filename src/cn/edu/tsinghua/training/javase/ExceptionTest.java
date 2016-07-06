package cn.edu.tsinghua.training.javase;

/**
 * Created at 221
 * 16-7-6 下午2:03.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        // ...
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
        // ...
        }

        System.out.println("test...");
    }
}
