package cn.edu.tsinghua.training.javase.basic.sea;

/**
 * Created by Administrator
 * 2016/6/29.
 */
public class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Flyingfish swim...: " + getName());
    }

    @Override
    public void fly() {
        System.out.println("Flyingfish fly...: " + getName());
    }
}
