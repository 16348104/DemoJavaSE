package cn.edu.tsinghua.training.javase.basic;

import java.util.Hashtable;

/**
 * Created by Administrator
 * 2016/7/4.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("k1", 1);
        hashtable.put("k2", 2);
        hashtable.put("k2", 3);

//        hashtable.clear();
//
//        System.out.println(hashtable.size());
//        System.out.println(hashtable.get("k2"));

        for (String s : hashtable.keySet()) {

            System.out.println(s + " -> " + hashtable.get(s));
        }
    }
}
