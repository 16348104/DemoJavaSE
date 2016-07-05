package cn.edu.tsinghua.training.javase.exercises;

import java.util.*;

/**
 * Created by Administrator
 * 2016/6/28.
 */
// 输入三个整数x，y，z，请把这三个数由小到大输出。
public class E15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        String line;
        while (!(line = scanner.nextLine()).equals("end")) {
            list.add(Integer.valueOf(line));
        }

        Collections.sort(list);
        Collections.reverse(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        int z = scanner.nextInt();
////list set
//        int[] ints = {x, y, z};
//        Arrays.sort(ints);

//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
    }
}
