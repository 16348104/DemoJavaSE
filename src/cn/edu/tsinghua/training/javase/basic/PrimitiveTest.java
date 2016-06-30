package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class PrimitiveTest {
    public static void main(String[] args) {
        boolean b = true; // Boolean
        byte b1; // Byte
        short s; // Short
        char c; // Character
        long l; // Long
        float f; // Float
        double d = 1.234; // Double

        Boolean b2 = false;
        Byte b3 = (byte) 12;

        System.out.println(Integer.MAX_VALUE);

//        int <-> String
        int i = 100; // Integer
        String s1 = String.valueOf(i);

        String s2 = "1234";
        int i1 = Integer.parseInt(s2);
        System.out.println(i1 + 123); // ?

        String s3 = "12.34";
        double v = Double.parseDouble(s3);

        System.out.println(b3.compareTo((byte) 1));

        Integer integer = 2;
        Integer integer1 = 30;
        System.out.println(integer.compareTo(integer1));
    }
}
