package cn.edu.tsinghua.training.javase.basic;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 * Created at 221
 * 16-7-7 上午9:33.
 */
public class StackTraceDemo {
    public static void main(String[] args) {
        try {
            c();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("test...");

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("c:/demo_examination.log", "r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void c() {
        b();
    }

    private static void b() {
        a();
    }

    private static String a() {
        String text = null;
        return text.toUpperCase();
    }
}
/*
java.lang.NullPointerException
	at cn.edu.tsinghua.training.javase.basic.StackTraceDemo.a(StackTraceDemo.java:27)
	at cn.edu.tsinghua.training.javase.basic.StackTraceDemo.b(StackTraceDemo.java:22)
	at cn.edu.tsinghua.training.javase.basic.StackTraceDemo.c(StackTraceDemo.java:18)
	at cn.edu.tsinghua.training.javase.basic.StackTraceDemo.main(StackTraceDemo.java:10)

Exception in thread "main" java.lang.NullPointerException
    at cn.edu.tsinghua.training.javase.basic.StackTraceDemo.a(StackTraceDemo.java:27)
    at cn.edu.tsinghua.training.javase.basic.StackTraceDemo.b(StackTraceDemo.java:22)
    at cn.edu.tsinghua.training.javase.basic.StackTraceDemo.c(StackTraceDemo.java:18)
    at cn.edu.tsinghua.training.javase.basic.StackTraceDemo.main(StackTraceDemo.java:10)
*/
