package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created at 221
 * 16-7-5 下午3:50.
 */
public class E16 {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i >= j) {
                    System.out.print((i + 1) + " * " + (j + 1) + " = " + (i + 1) * (j + 1) + "\t");
                }
            }
            System.out.println();
        }
    }
}
