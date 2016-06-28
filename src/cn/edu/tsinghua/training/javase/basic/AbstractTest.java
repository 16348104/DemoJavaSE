package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/28.
 */

// abstract
public abstract class AbstractTest {

    private int i;

    public abstract String method(String s);

    public abstract void m2();

    public void m() {
        i = 0;
    }

    public static void main(String[] args) {
//        AbstractTest abstractTest = new AbstractTest();
//        i = 1;
        SubAbstractTest subAbstractTest = new SubAbstractTest();
//        System.out.println(subAbstractTest.i);
        subAbstractTest.m();
        subAbstractTest.method("");
        subAbstractTest.m2();
    }
}

class SubAbstractTest extends AbstractTest {

    @Override // 注解
    public String method(String s) {
        return null;
    }

    public void m2() {

    }
}
