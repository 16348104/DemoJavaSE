package cn.edu.tsinghua.training.javase.basic.sea;

/**
 * Created by Administrator
 * 2016/6/29.
 */
public class Shark extends Fish {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Shark: " + getName());
    }
}
