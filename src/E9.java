/**
 * Created by mingfei.net@gmail.com
 * 2016/6/22 15:25
 */
// 一个数如果恰好等于它的因子之和，这个数就称为’完数’
// 例如 6=1＋2＋3.编程 找出1000以内的所有完数
public class E9 { // 28 = 1 +　２　＋　４　＋　７　＋　１４

    public static void main(String[] args) {
        for (int i = 1; i < 10000000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
