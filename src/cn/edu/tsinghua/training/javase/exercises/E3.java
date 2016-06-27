package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/22 13:13
 */
// 打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
// 例如：153是一个“水仙花数’，因为 153=1^3＋5^3＋3^3
public class E3 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            byte b = (byte) (i / 100); // 百位数字
            byte s = (byte) (i % 100 / 10); // 十位数字
            byte g = (byte) (i % 10); // 个位数字
            if (Math.pow(b, 3) + Math.pow(s, 3) + Math.pow(g, 3) == i) {
                System.out.println(i);
            }
        }
    }
}
