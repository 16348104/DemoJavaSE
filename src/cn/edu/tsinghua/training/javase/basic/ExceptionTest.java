package cn.edu.tsinghua.training.javase.basic;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created at 221
 * 16-7-6 下午2:03.
 */
public class ExceptionTest {

    private void method() {

    }

    // SomeException

    private void test() throws NullPointerException {

    }

    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        String[] strings = {};
        String s = "hi";
        String string = "l23";

        ExceptionTest exceptionTest = new ExceptionTest();

        exceptionTest.test();

        exceptionTest = null;


        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("c:/demo_examination.log", "r"); // read
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // ...
        try {
            exceptionTest.method(); // NPE
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
        } catch (NullPointerException e) {
            System.out.println("NullPointerException...");
        } finally {
            System.out.println("finally...");
        }

        System.out.println("test...");
    }
}
