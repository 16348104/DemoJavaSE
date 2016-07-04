package cn.edu.tsinghua.training.javase.basic;

import java.util.Vector;

/**
 * Created by Administrator
 * 2016/7/4.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("aa");
        strings.add("bb");
        strings.add("cc");

        for (String string : strings) {
            System.out.println(string);
        }

//        strings.clear();
//
//        System.out.println(strings.size());
//        System.out.println(strings.get(2));
//
//        Vector<Boolean> booleen = new Vector<>();
    }
}
