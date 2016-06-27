package cn.edu.tsinghua.training.javase.util;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/27 14:07
 */
public class DefaultTest {

    int i;
    private double d;
    public boolean b;
    protected String s;

    void m1() {
        m2();
        System.out.println(d);
    }

    private void m2() {

    }

    public void m3() {

    }

    protected void m4() {

    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
}
