package cn.edu.tsinghua.training.javase.basic.collections;

import java.util.*;

/**
 * Created at 221
 * 16-7-5 下午1:09.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

//        System.out.println(integers.);
//        System.out.println(integers.size());

//        for (Integer integer : integers) {
//            System.out.print(integer);
//        }

        Iterator<Integer> iterator = integers.iterator(); // 迭代器
        while (iterator.hasNext()) {
            Integer next = iterator.next();
//            System.out.println(next);
        }

        Set<String> strings = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++) {
            strings.add(i + "");
        }

        for (String string : strings) {
//            System.out.println(string);
        }

        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(-1);
        set.add(100);
        set.add(-200);

        Iterator<Integer> iterator1 = set.descendingIterator();

        while (iterator1.hasNext()) {
            Integer next = iterator1.next();
            System.out.println(next);
        }
        System.out.println("------");
        for (Integer integer : set) {
            System.out.println(integer);
        }

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("asdf");
        set1.add("apple");
        set1.add("java");
        set1.add("javaSe");

        set1 = (TreeSet<String>) set1.descendingSet();
        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println("---------");
        for (String s : set1) {
            System.out.println(s);
        }
    }
}
