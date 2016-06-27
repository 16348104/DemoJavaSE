package cn.edu.tsinghua.training.javase.basic;

import java.math.BigDecimal;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/27 10:02
 */
public class Calculator {

    // add sub mul div

    int add(int x, int y) {
        return x + y;
    }

    double add(double x, double y) {
        BigDecimal bigDecimalX = new BigDecimal(Double.toString(x));
        BigDecimal bigDecimalY = new BigDecimal(Double.toString(y));
        return bigDecimalX.add(bigDecimalY).doubleValue();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 1;
        int y = 2;
        System.out.println(x + " + " + y + " = " + calculator.add(x, y));

        double a = 0.1;
        double b = 0.2;
        System.out.println(a + " + " + b + " = " + calculator.add(a, b));

    }
}
