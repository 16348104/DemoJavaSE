package cn.edu.tsinghua.training.javase.basic;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created at 221
 * 16-7-7 上午9:49.
 */
public class CheckedExceptionTest {
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test() throws FileNotFoundException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("", "r");
        throw new NullPointerException();
    }

}

class MyException extends Exception {

}
