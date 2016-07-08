package cn.edu.tsinghua.training.javase.basic;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created at 221
 * 16-7-8 上午10:07.
 */
public class DownloadTest {
    private static final String link = "http://www.vladstudio.com/zh/wallpapers/?skip=0";
    private static int counter;

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(link);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("img")) {
                    String imgURL = line.substring(line.indexOf("http"), line.indexOf("\" alt"));
                    saveImg(imgURL, ++counter);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("done.");
    }

    private static void saveImg(String imgURL, int fileName) throws MalformedURLException {
        URL url = new URL(imgURL);
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("data/" + fileName + ".jpg"))) {
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
