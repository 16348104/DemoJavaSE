package cn.edu.tsinghua.training.javase.basic;

import static java.lang.System.out;

/**
 * Created by Administrator
 * 2016/6/28.
 */
public class Person {
    private String name;
    private static String earth; // 地球

    public static void m1() {
//        name = "lisi";
        earth = "";
    }

    public static void main(String[] args) {

        earth = "地球";
        out.println(earth);

//        name = "zhangsan";
//        Person zhangsan = new Person();
//        zhangsan.name = "张三";
//        zhangsan.earth = "张三在清华里种了一棵树";
//
//        Person lisi = new Person();
//        lisi.name = "李四";
//
//        System.out.println(zhangsan.name);
//        System.out.println(zhangsan.earth);
//        System.out.println(lisi.name);
//        System.out.println(lisi.earth);
    }
}
