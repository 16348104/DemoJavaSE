package cn.edu.tsinghua.training.javase.basic.sea;

/**
 * Created by Administrator
 * 2016/6/29.
 */
public abstract class Fish implements Swimmer {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
