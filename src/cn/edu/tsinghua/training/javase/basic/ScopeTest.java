package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class ScopeTest {
    private int i;



    public void m1(boolean b) {
        int i = 0;
        System.out.println(this.i);
        int j = 0;
        System.out.println(j);
        System.out.println(s);
        System.out.println(b);
        m2();
    }

    public static void m3() {
//        System.out.println(i);
    }

    public void m2() {
        String s1 = "";
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
        for (int k = 0; k < 10; k++) {
            System.out.println(k);
        }
        int k;
        System.out.println(s1);
    }

    private String s;

}
