package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/27 9:34
 */
public class OverloadTest {

    int i;
    double d;
    boolean b;
    int j;

    public OverloadTest(int i, double d, boolean b) {
        this.i = i;
        this.d = d;
        this.b = b;
    }

    public OverloadTest(int i) {
        this.i = i;
    }

    public OverloadTest(double d) {
        this.d = d;
    }

    public OverloadTest(boolean b) {
        this.b = b;
    }

    public OverloadTest(int i, double d) {
        this.i = i;
        this.d = d;
    }

    public OverloadTest() {
    }

    void method(double d) {

    }

    String method(double j, int i) { // j
        return null;
    }

    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();
        overloadTest.method(2.0);
    }
}
