import java.util.Scanner;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/22 15:16
 */
public class E6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input M:");
        int m = scanner.nextInt();
        System.out.println("input N:");
        int n = scanner.nextInt();

        for (int i = Math.min(m, n); i > 0; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println(i);
                break;
            }
        }

        for (int i = Math.max(m, n); ; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
