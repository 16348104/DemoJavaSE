package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/22 13:22
 */
// 将一个正整数分解质因数。
// 例如：输入90，打印出90 = 2*3*3*5。
public class E4 {
    public static void main(String[] args) {
        // 100 = 2*2*5*5
        // 120 = 2*2*2*3*5
        // 121 = 11 * 11
        // 1000 = 2*2*2*5*5*5
        // 123456789 =

        int n = 123456789;
        System.out.print(n + " = ");
        compute(n);
    }

    static void compute(int n) {
        for (int i = 2; i < n + 1; i++) {
            if (i == n) {
                System.out.print(i);
            } else if (n % i == 0) {
                System.out.print(i + "*");
                compute(n / i); // 递归调用
                break;
            }
        }
    }
}
