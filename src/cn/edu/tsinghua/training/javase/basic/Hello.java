package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/20 13:51
 */
class Hi { // 类文件 / 字节码文件
//    boolean
//    byte
//    char
//    short
//    int
//    long
//    float
//    double
    public static void main(String[] args) {
        boolean isMarried; // 匈牙利命名法 / 驼峰命名法
        isMarried = true;

        double d = 1;

        byte b = -128;
        char c = '\n'; // tab
        short s = Short.MAX_VALUE;
        int i = -2147483648;
        long l = 2L;

        float f = 1.2f;

//        System.out.println(i);
//        System.out.println(b);
        System.out.println(c);
//        System.out.println(s);
//        System.out.println(l);
//        System.out.println(Float.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);

        String s1 = "hello...";
        System.out.println(s1);
    }
}
