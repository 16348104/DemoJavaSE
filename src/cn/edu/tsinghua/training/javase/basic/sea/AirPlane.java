package cn.edu.tsinghua.training.javase.basic.sea;

/**
 * Created by Administrator
 * 2016/6/29.
 */
public class AirPlane implements Flyer {

    private String name;

    public AirPlane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("AirPlane fly...:" + getName());
    }
}
