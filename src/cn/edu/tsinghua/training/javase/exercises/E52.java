package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/23 14:38
 */
public class E52 {

    static int counter;

    public static void hanoi(int n, char src, char with, char dest) {
        if (n == 1) {
//            System.out.println(src + "->" + dest);
            counter++;
        } else {
            hanoi(n - 1, src, dest, with); // ***
//            System.out.println(src + "->" + dest);
            counter++;
            hanoi(n - 1, with, src, dest);
        }
    }

    public static void main(String[] args) {
        hanoi(64, 'a', 'b', 'c');
        System.out.println(counter  / 365);
    }
}
