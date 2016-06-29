package cn.edu.tsinghua.training.javase.basic.sea;

/**
 * Created by Administrator
 * 2016/6/29.
 */
public class Seaplane extends AirPlane implements Swimmer {

    public Seaplane(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Seaplane fly...: " + getName());
//        super.fly();
    }

    @Override
    public void swim() {
        System.out.println("Seaplane swim...: " + getName());
    }
}
