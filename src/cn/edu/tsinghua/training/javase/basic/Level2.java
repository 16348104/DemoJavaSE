package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/21 15:25
 */
public class Level2 {
    public static void main(String[] args) {
        int score = 88;
        int quotient = score / 10;
        char level;
        switch (quotient) {
            case 10:
            case 9:
                level = 'A';
                System.out.println(level);
                break;
            case 8:
                level = 'B';
                System.out.println(level);
                break;
            case 7:
                level = 'C';
                System.out.println(level);
                break;
            case 6:
                level = 'D';
                System.out.println(level);
                break;
            default:
                level = 'E';
                System.out.println(level);
                break;
        }
//        System.out.println(level);
    }
}
