package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created at 221
 * 16-7-5 下午3:55.
 */
/*

打印出如下图案（菱形）
   x
  xxx
 xxxxx
xxxxxxx
 xxxxx
  xxx
   x
要求只使用以下三种语句
1. System.out.print(" ")
2. System.out.print("x");
3. System.out.println("x") line

N 任意奇数
*/

public class E19 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            // 1. space
            for (int j = 3 - i; j > 0; j--) {
                System.out.print(" ");
            }
            // 2. x
            for (int k = 0; k < i * 2; k++) {
                System.out.print("x");
            }
            // 3. x
            System.out.println("x");
        }
        for (int i = 0; i < 3; i++) {
            // 1. space
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            // 2. x
            for (int k = 4 - i * 2; k > 0; k--) {
                System.out.print("x");
            }
            // 3. x
            System.out.println("x");
        }

    }
}
