package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/29.
 */
public interface InterfaceTest extends A, B {
    int ONE = 1;

    void method();

}

interface A {
    void a();
}

interface B {
    void b();
}

class InterfaceTestClass implements InterfaceTest{

    @Override
    public void method() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}


