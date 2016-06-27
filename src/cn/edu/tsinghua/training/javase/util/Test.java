package cn.edu.tsinghua.training.javase.util; //打包

import cn.edu.tsinghua.training.javase.basic.Human;

import java.util.*;

import java.lang.*; // language

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/27 13:27
 */
public class Test {
    public static void main(String[] args) {

//        Human human = new Human();

        Human human = new Human();

        Util util = new Util();

        Date date = new Date();

        java.util.Date date1 = new java.util.Date();

        Random random = new Random();

        System.out.println("test...");
        String s = "";
        System.out.println(Math.random());

        DefaultTest defaultTest = new DefaultTest();
        defaultTest.m1();
//        System.out.println(defaultTest.b);
//        System.out.println(defaultTest.s);
        defaultTest.m4();
    }
}
