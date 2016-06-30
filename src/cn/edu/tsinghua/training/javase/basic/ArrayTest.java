package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[10];

        for (int i = 0; i < 10; i++) {
            ints[i] = i;
        }
        System.out.println(ints[9]); // index 索引 下标
//        int ints[] = new int[10];
        System.out.println(ints.length);
    }
}
