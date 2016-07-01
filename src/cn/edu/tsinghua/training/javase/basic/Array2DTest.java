package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/7/1.
 */
public class Array2DTest {
    public static void main(String[] args) {
        String[][] strings = new String[3][5];
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                strings[i][j] = i + ":" + j;
            }
        }
        System.out.println(strings[2][4]); // Runtime Exception
        System.out.println(strings[0].length);
        System.out.println(strings[1].length);
        System.out.println(strings[2].length);
    }
}
