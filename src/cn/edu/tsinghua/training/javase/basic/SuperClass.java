package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/24 9:17
 */
public class SuperClass {
    boolean b;
    int i;
    double d;

//    public cn.edu.tsinghua.training.javase.basic.SuperClass() {
//
//    }

    public SuperClass(int n) {
        System.out.println("invoke cn.edu.tsinghua.training.javase.basic.SuperClass constructor...");
    }

    void m1() {

    }

    void m2() {

    }
}

class SubClass extends SuperClass {

    public SubClass(int n) {
        super(n);
        System.out.println("invoke cn.edu.tsinghua.training.javase.basic.SubClass constructor...");
    }

    int j;

    void m3() {
        super.m1();
    }
}

class GrandsonClass extends SubClass {
    int k;

    public GrandsonClass(int n) {
        super(n);
    }

    void m4() {

    }
}

class SubClassTest {
    public static void main(String[] args) {
//        cn.edu.tsinghua.training.javase.basic.GrandsonClass grandsonClass = new cn.edu.tsinghua.training.javase.basic.GrandsonClass();
//        System.out.println(grandsonClass.i);
//        System.out.println(grandsonClass.j);
//        System.out.println(grandsonClass.k);


//        cn.edu.tsinghua.training.javase.basic.SuperClass superClass = new cn.edu.tsinghua.training.javase.basic.SubClass();
//        System.out.println(superClass.i);
//        superClass.m1();

//        cn.edu.tsinghua.training.javase.basic.SubClass subClass = new cn.edu.tsinghua.training.javase.basic.SubClass();
//        System.out.println(subClass.j);
//        subClass.m2();
//        subClass.m3();
    }
}
