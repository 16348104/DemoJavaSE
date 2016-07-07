package cn.edu.tsinghua.training.javase.basic;

import java.io.*;

/**
 * Created at 221
 * 16-7-7 上午10:50.
 */
public class InputStreamTest {
    public static void main(String[] args) {
//        InputStream inputStream = null;
//        OutputStream outputStream = null;
        Reader reader = null;
        Writer writer = null;
        try {
//            inputStream = new FileInputStream("c:/test.txt");
//            outputStream = new FileOutputStream("c:/new.txt");
//            int i = inputStream.read();
//            while (i != -1) {
//                System.out.print((char) i);
//                outputStream.write(i);
//                i = inputStream.read();
//            }

            reader = new FileReader("c:/test.txt");
            writer = new FileWriter("c:/new.txt");
            int i = reader.read();
            while (i != -1) {
                System.out.print((char)i);
                writer.write(i);
                i = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            if (inputStream != null) {
//                try {
//                    inputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (outputStream != null) {
//                try {
//                    outputStream.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
