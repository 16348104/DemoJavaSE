package cn.edu.tsinghua.training.javase.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created at 221
 * 16-7-7 上午8:55.
 */
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {
            try {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            } catch (InputMismatchException e) {
                System.out.println("invalid number: " + scanner.next());
            }
        }
        System.out.println("average: " + (sum / count));
    }
}
