/**
 * Created by mingfei.net@gmail.com
 * 2016/6/21 16:19
 */
//判断[101-200]有多少个素数，并输出所有素数。素数：只能被1和它本身整除的正整数（1不是素数）
public class E2 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 2; i < 201; i++) {
            boolean b = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println("total: " + counter);
    }
}
