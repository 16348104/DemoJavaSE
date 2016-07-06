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
        String string = "l23";
        // ...
        try {
            int i = Integer.parseInt(string);
            System.out.println(x / y);
            System.out.println(strings[0]);
            System.out.println(s.charAt(2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException...");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException...");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException...");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException...");
        } finally {
            System.out.println("finally...");
        }

        System.out.println("test...");
    }
}
