/**
 * Created by mingfei.net@gmail.com
 * 2016/6/22 10:06
 */
public class Absolute {
    public static void main(String[] args) {
        System.out.println(Math.random()); // [0.0,1.0)  [0,9]
        for (int i = 0; i != 5; i = (int) (Math.random() * 10)) {
            System.out.println(i);
        }
    }
}
