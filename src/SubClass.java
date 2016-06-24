/**
 * Created by mingfei.net@gmail.com
 * 2016/6/24 9:20
 */
public class SubClass extends SuperClass {
    int j;

    void m3() {

    }
}

class GrandsonClass extends SubClass {
    int k;

    void m4() {

    }
}

class SubClassTest {
    public static void main(String[] args) {
        GrandsonClass grandsonClass = new GrandsonClass();
        System.out.println(grandsonClass.i);
        System.out.println(grandsonClass.j);
        System.out.println(grandsonClass.k);


        SuperClass superClass = new SubClass();
        System.out.println(superClass.i);
        superClass.m1();

        SubClass subClass = new SubClass();
        System.out.println(subClass.j);
        subClass.m2();
        subClass.m3();
    }
}
