package cn.edu.tsinghua.training.javase.basic;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created at 221
 * 16-7-7 下午2:04.
 */
public class CloseTest implements Closeable {

    public CloseTest() throws IOException {
    }

    @Override
    public void close() throws IOException {
        System.out.println("closed...");
    }

    public void method() {
        System.out.println("method...");
    }
}

class CloseService {
    public static void main(String[] args) {
        // try with resources JDK 1.7
        try (CloseTest closeTest = new CloseTest()) {
            closeTest.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
