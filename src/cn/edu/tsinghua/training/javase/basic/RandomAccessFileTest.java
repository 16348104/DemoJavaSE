package cn.edu.tsinghua.training.javase.basic;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created at 221
 * 16-7-7 下午3:13.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("c:/data", "rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(0.5 * i);
            }
            randomAccessFile.seek(32); // seek I Seek U > OICQ > QQ
            double d = randomAccessFile.readDouble();
            System.out.println(d);
        } catch (IOException e) {
            e.printStackTrace(); // EOFException End Of File
        }
    }
}
