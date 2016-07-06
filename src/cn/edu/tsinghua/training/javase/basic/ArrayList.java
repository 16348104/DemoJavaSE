package cn.edu.tsinghua.training.javase.basic;

import java.util.Arrays;

/**
 * Created at 221
 * 16-7-6 下午1:19.
 */
public class ArrayList<E> { // LinkedList
    private Object[] list;
    private int index;

    public ArrayList() {
        list = new Object[10];
    }

    public void add(E e) {
        if (index == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[index++] = e;
    }

    public E get(int index) {
        return (E) list[index];
    }

    public int size() {
        return index;
    }

    public int capacity() { // 容量
        return list.length;
    }

    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("hello");
//        arrayList.add("hi");
//        arrayList.add(1);
//        arrayList.add(true);
//        arrayList.add("hello");
//        arrayList.add("hi");
//        arrayList.add(1);
//        arrayList.add(true);
//        arrayList.add(true);
//        arrayList.add(true);
//        arrayList.add(true);
//
//        String s = (String) arrayList.get(0);
//
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.size());
//        System.out.println(arrayList.capacity()); // ?

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        String s = list.get(0);
    }
}
