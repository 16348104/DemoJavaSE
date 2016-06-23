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

//    public Human() { // 构造方法 constructor
//
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
        study("Web开发");
        return hour;
    }

    public String study(String content) {
        eat("面包","早晨");
        System.out.println("study " + content);
        return content;
    }

    public void work() {

    }

    public static void main(String[] args) {
        Human zhangsan = new Human("张三", "男", 18, 1.7, 65, false); // Ctrl + P(arameter)
        System.out.println(zhangsan.name);
        System.out.println(zhangsan.gender);
        System.out.println(zhangsan.age);
        System.out.println(zhangsan.height);
        System.out.println(zhangsan.weight);
        System.out.println(zhangsan.isMarried);

        zhangsan.eat("米饭", "中午");
    }
}
