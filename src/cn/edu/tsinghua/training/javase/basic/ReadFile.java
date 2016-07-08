package cn.edu.tsinghua.training.javase.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created at 221
 * 16-7-8 上午8:54.
 */
public class ReadFile {

    private static int counter;

    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data/zhihu.html"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}
