/**
 * Created by mingfei.net@gmail.com
 * 2016/6/23 15:19
 */
// 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下
// 求它在第10次落地时，共经过多少米？第10次反弹多高？
public class E10 {
    double height;

    public E10(double height) {
        this.height = height;
    }

    double totalDistance(int n) {
        double sum = 0;
//        // 2
//        sum = reboundHeight(1) * 2;
//        // 3
//        sum = reboundHeight(1) * 2 + reboundHeight(2)*2;

        for (int i = ; i < n; i++) {
            sum += reboundHeight(n-1) * 2;
        }

        return height + sum;
    }

    double reboundHeight(int n) {
        return height / Math.pow(2, n);
    }
}

class E10Test {
    public static void main(String[] args) {
        E10 e10 = new E10(100);
        int n = 2;
        System.out.println("total distance: " + e10.totalDistance(n));
        System.out.println("rebound height of " + n + ": " + e10.reboundHeight(n));
    }
}
