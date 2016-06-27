package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/27 10:02
 */
public class Calculator {

    private int x;
    private int y;

//    public Calculator(int x, int y) {
//        this.x = x;
//        if (y==0) {
//            System.out.println("y can not be zero...");
//            System.exit(0);
//        }
//        this.y = y;
//    }

    public int div() {
        return x / y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        if (y == 0) {
            System.out.println("y can not be zero...");
            System.exit(0);
        }
        this.y = y;
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
//        calculator.x = 1;
//        calculator.y = 2;
//        System.out.println(calculator.getX());
//        System.out.println(calculator.getY());
        calculator.setX(3);
        calculator.setY(0);
        System.out.println(calculator.div());
    }
}
