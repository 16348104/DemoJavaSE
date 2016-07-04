package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/7/4.
 */
public class StringBufferTest {
    public static void main(String[] args) {
        String s = "test...";

        StringBuffer stringBuffer = new StringBuffer(s);
        stringBuffer.append(1).append(false).append(1.2).append("hello");
        System.out.println(stringBuffer.reverse());
    }

}
