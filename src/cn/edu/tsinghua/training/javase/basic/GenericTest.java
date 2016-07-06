package cn.edu.tsinghua.training.javase.basic;

import java.util.LinkedList;
import java.util.List;

/**
 * Created at 221
 * 16-7-6 上午8:52.
 */
// Generic 泛型 泛化的类型 JDK 1.5 类型安全 type safe
public class GenericTest<T extends Number, S extends Number> extends Number {
/*
    private String add(int x, int y) {
        return String.valueOf(x) + String.valueOf(y);
    }

    private String add(double x, double y) {
        return String.valueOf(x) + String.valueOf(y);
    }

    private String add(int x, double y) {
        return String.valueOf(x) + String.valueOf(y);
    }

    private String add(GenericTest test1, GenericTest test2) {
        return String.valueOf(test1) + String.valueOf(test2);
        // FQN@HEX cn.edu.tsinghua.training.javase.basic.GenericTest@
    }
*/

    private String add(T t1, S t2) {
        return String.valueOf(t1) + String.valueOf(t2);
    }

    public static void main(String[] args) {
        GenericTest<Integer, Integer> genericTest = new GenericTest<>();
        System.out.println(genericTest.add(1, 2));
        GenericTest<Double, Double> genericTest1 = new GenericTest<>();
        System.out.println(genericTest1.add(1.1, 2.2));

        GenericTest<Integer, Double> genericTest2 = new GenericTest<>();
        System.out.println(genericTest2.add(1, 2.2));

        GenericTest<GenericTest, GenericTest> genericTest3 = new GenericTest<>();
        System.out.println(genericTest3.add(new GenericTest(), new GenericTest()));

//        List<String> words = new LinkedList<>();

//        GenericTest genericTest2 = new GenericTest();

//        GenericTest genericTest = new GenericTest();
//        System.out.println(genericTest.add(1, 2));
//        System.out.println(genericTest.add(1.1, 2.2));
//        System.out.println(genericTest.add(1, 2.2));
//        System.out.println(genericTest.add(new GenericTest(), new GenericTest()));
    }

    @Override
    public String toString() {
        return "GenericTest instance";
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

interface Comparator<T> {
    int compare(T o1, T o2);
}

class StringComparator<T> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return 0;
    }
}
