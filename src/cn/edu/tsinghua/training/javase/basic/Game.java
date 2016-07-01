package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/7/1.
 */
public class Game {
    public static void main(String[] args) {
        char[] chars = {'红', '绿', '蓝', '白', '黑', '黄'};
        int n = 14;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int r  = (int)(Math.random()*6);
                System.out.print(chars[r] + " ");
            }
            System.out.println();
        }
    }
}
