package cn.edu.tsinghua.training.javase.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created at 221
 * 16-7-7 上午10:50.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("c:/test.txt");
            System.out.println((char) inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
