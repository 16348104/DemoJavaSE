package cn.edu.tsinghua.training.javase.basic;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Administrator
 * 2016/7/4.
 */
public class DateTest {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date); // 2016-07-04

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

//        Date date1 = new Date(100, 0, 2, 12, 24, 56);
//        System.out.println(date1);

        Date date2 = new Date(1500000000000L);
        System.out.println(date2);
    }
}
