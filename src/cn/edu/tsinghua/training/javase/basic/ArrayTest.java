package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[100];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        System.out.println(ints[9]); // index 索引 下标
//        int ints[] = new int[10];
        System.out.println(ints.length);

        String[] strings = {"test", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hi", "hello", "hitest"};
        System.out.println(strings.length);
        System.out.println(strings[strings.length - 1]);

        for (String s : strings) {
            System.out.println(s);
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.println(i);
            System.out.println(strings[i]);
        }
    }
}
