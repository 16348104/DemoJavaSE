/**
 * Created by mingfei.net@gmail.com
 * 2016/6/22 14:37
 */
// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
// F(n) = 1 (n=1,n=2)
// F(n) = F(n-2) + F(n-1) (n>2)
public class E0 {
    public static void main(String[] args) {

        int n = 51;
        System.out.println("f(" + n + ") = " + f(n));
    }

    static long f(int n) { // fibonacci
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return f(n - 2) + f(n - 1);
        }
    }
}
