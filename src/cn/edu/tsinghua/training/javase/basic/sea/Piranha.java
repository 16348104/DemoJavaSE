package cn.edu.tsinghua.training.javase.basic.sea;

/**
 * Created by Administrator
 * 2016/6/29.
 */
public class Piranha extends Fish {

    public Piranha(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Piranha: " + getName());
    }
}

/*
Vehicle

Car is a Vehicle
Bicycle

Human is a Fish




 */
