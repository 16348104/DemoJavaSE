/**
 * Created by mingfei.net@gmail.com
 * 2016/6/24 9:17
 */
public class SuperClass {
    boolean b;
    int i;
    double d;

//    public SuperClass() {
//
//    }

    public SuperClass(int n) {
        System.out.println("invoke SuperClass constructor...");
    }

    void m1() {

    }

    void m2() {

    }
}

class SubClass extends SuperClass {

    public SubClass(int n) {
        super(n);
        System.out.println("invoke SubClass constructor...");
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
//        GrandsonClass grandsonClass = new GrandsonClass();
//        System.out.println(grandsonClass.i);
//        System.out.println(grandsonClass.j);
//        System.out.println(grandsonClass.k);


//        SuperClass superClass = new SubClass();
//        System.out.println(superClass.i);
//        superClass.m1();

//        SubClass subClass = new SubClass();
//        System.out.println(subClass.j);
//        subClass.m2();
//        subClass.m3();
    }
}
