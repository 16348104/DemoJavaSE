package cn.edu.tsinghua.training.javase.basic.collections;

import java.util.HashSet;
import java.util.Set;

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
        System.out.println(integers.size());

        for (Integer integer : integers) {
            System.out.print(integer);
        }
    }
}
