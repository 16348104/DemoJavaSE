package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/27 10:45
 */
public class OverwriteTest {

    void method() {
        System.out.println("method in super class...");
    }
}

class SubOverwriteTest extends OverwriteTest {

    void method() {
        super.method();
        System.out.println("method in sub class");
    }

    public static void main(String[] args) {
        SubOverwriteTest subOverwriteTest = new SubOverwriteTest();
        subOverwriteTest.method();
    }
}

