package cn.edu.tsinghua.training.javase.basic;

import java.io.File;

/**
 * Created at 221
 * 16-7-8 上午9:06.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("data/zhihu.html");
        file.setLastModified(150000000000L);
    }
}
