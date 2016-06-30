package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/30.
 */
public class CallByValue {

    public static void main(String[] args) {
        Customer c1 = new Customer("Justin");
        some(c1); // 实际参数
//        System.out.println(c1.getName()); // John

        Customer c2 = new Customer("Justin");
        other(c2);
//        System.out.println(c2.getName()); // Justin

        int i = 0;
        System.out.println(i); // 1: 0
        test(i);
        System.out.println(i); // 3: ?
    }

    public static void some(Customer c) {  // 形式参数
        c.setName("John");
    }

    public static void other(Customer c) {
        c = new Customer("Bill");
    }

    public static void test(int i) {
        i++;
        System.out.println(i); // 2: 1
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}