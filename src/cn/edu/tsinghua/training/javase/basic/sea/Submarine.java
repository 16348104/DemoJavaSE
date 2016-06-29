package cn.edu.tsinghua.training.javase.basic.sea;

/**
 * Created by Administrator
 * 2016/6/29.
 */
public class Submarine implements Swimmer {

    private String name;

    public Submarine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println("Submarine: " + getName());
    }
}
