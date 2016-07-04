package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/7/4.
 */
public class StringAndStringBufferTest {
    private static final String TEST = "test";

    public static void main(String[] args) {
        String s = "";
        StringBuffer buffer = new StringBuffer("");

        for (int i = 0; i < 100000; i++) {
//            s += TEST; // s = s + TEST;
            buffer.append(TEST);
        }

//        System.out.println(s.length()); //
        System.out.println(buffer.length());

        StringBuilder stringBuilder = new StringBuilder("");
    }
}
