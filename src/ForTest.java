/**
 * Created by mingfei.net@gmail.com
 * 2016/6/21 16:02
 */
public class ForTest {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }


        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                if (j == 5) {
                    break;
                }
                System.out.print(j + ", " + k + "\t");
            }
            System.out.println();
        }
    }
}
