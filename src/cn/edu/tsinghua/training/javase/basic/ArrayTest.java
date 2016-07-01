package cn.edu.tsinghua.training.javase.basic;

import java.util.Arrays;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class ArrayTest {

    public void m() {

    }

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

        Object[] objects = {1, "asdf", true, 1.234, new ArrayTest()};
        for (Object object : objects) {
            System.out.println(object);
        }

        System.out.println(Arrays.toString(strings));
    }
}

class Mankind extends ArrayTest {
    private String name;
    private int age;
    private char gender;

    public Mankind(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Mankind mankind = new Mankind("zhangsan", 18, 'M');
        System.out.println(mankind);
    }


    @Override
    public String toString() {
        return "Mankind{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
