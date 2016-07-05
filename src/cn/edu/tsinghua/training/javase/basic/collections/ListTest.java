package cn.edu.tsinghua.training.javase.basic.collections;

import java.util.*;

/**
 * Created at 221
 * 16-7-5 上午9:22.
 */
public class ListTest {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(1);

        System.out.println(integers.size());

        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(1);
        integers1.add(1);

        System.out.println(integers1.size());

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("a");
        strings.add("b");

        System.out.println(strings.get(2));
        System.out.println(strings.size());

        List<String> strings1 = new LinkedList<>();
        strings1.add("a");
        strings1.add("a");
        strings1.add("b");

        System.out.println(strings1.get(2));
        System.out.println(strings1.size());


        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            list.add(i + "");
        }

        for (String s : list) {
            System.out.println(s);
        }

        list.add(0, "test");
//        list.set(0, "test");

        System.out.println(list.get(1));
        System.out.println(list.size());

//        long start = System.nanoTime();
////        list.remove("500000"); // 1000w
//        list.remove("0"); // 200w
////        list.remove("999999"); // 19903240
//        System.out.println(System.nanoTime() - start);
    }
}
