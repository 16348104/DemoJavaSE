/**
 * Created by mingfei.net@gmail.com
 * 2016/6/21 9:25
 */
public class Operator {
    public static void main(String[] args) {
        int x = 99;
        int y = 0;

        int z = (++x) - (y--);
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);
    }
}
