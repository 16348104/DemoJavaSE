package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/23 9:29
 */
// class = field(s) + method(s)
public class Human {
    String name;
    String gender;
    int age;
    double height;
    double weight;
    boolean isMarried;

    public Human() {
    }
//    public cn.edu.tsinghua.training.javase.basic.Human() { // 构造方法 constructor
//
//    }
//
//    public cn.edu.tsinghua.training.javase.basic.Human(String name) {
//        this.name = name;
//    }
//
//    public cn.edu.tsinghua.training.javase.basic.Human(String name, String gender, int age) {
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//    }

    // Alert + Insert
    public Human(String name, String gender, int age, double height, double weight, boolean isMarried) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public void eat(String food, String time) {
        System.out.println(name + " eat " + food + ", at " + time);
    }

    public int sleep(int hour) {
        System.out.println(name + " sleep " + hour);
        return hour;
    }

    public String study(String content) {
        System.out.println("study " + content);
        return content;
    }

    public void work() {

    }
}
