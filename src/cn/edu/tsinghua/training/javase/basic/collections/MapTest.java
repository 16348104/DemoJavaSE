package cn.edu.tsinghua.training.javase.basic.collections;

import java.util.*;

/**
 * Created at 221
 * 16-7-5 下午2:47.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(-1, "a");
        map.put(100, "a");
        map.put(0, "a");
        map.put(0, "a");

//        System.out.println(map.size());
//        System.out.println(map.get(0));


        for (Integer integer : map.keySet()) {
            System.out.println(integer + ":" + map.get(integer));
        }

        for (String s : map.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey() + ":" + integerStringEntry.getValue());
        }

        System.out.println(Collections.singletonList(map));
    }
}
