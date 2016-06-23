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

    public void eat(String food, String time) {
        System.out.println("eat " + food + ", at " + time);
        work();
//        return;
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
}
