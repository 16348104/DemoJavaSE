package cn.edu.tsinghua.training.javase.basic.collections;

import java.util.*;

/**
 * Created at 221
 * 16-7-5 上午9:22.
 */
public class Test {
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
    }
}
