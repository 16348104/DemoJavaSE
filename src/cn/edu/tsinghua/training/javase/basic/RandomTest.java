package cn.edu.tsinghua.training.javase.basic;

import java.util.Hashtable;
import java.util.Random;

/**
 * Created by Administrator
 * 2016/7/4.
 */
// 使用 java.util.Random 类 和 java.lang.Math 类 生成 [1, 20] 范围内的随机数 1M
// 比较两种方法的效率
// 比较两种方法的分布  Hashtable
public class RandomTest {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < 20; i++) {
            hashtable.put(i + 1, 0);
        }
        Random random = new Random();
        long start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            int r = (int)(Math.random()*20) + 1;
//            int r = random.nextInt(20) + 1;
            hashtable.put(r, hashtable.get(r) + 1); // ******
//            System.out.println(r);
        }
        System.out.println("total time: " + (System.nanoTime() - start));

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + " > " + hashtable.get(integer));
        }
    }
}
