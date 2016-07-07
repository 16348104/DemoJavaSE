package cn.edu.tsinghua.training.javase.basic.s;

import java.io.Serializable;

/**
 * Created at 221
 * 16-7-7 下午2:37.
 */
public class User implements Serializable {
    private Integer id;
    private String name;
    private double height;
    private transient boolean isMarried;

    public User() {
    }

    public User(Integer id, String name, double height, boolean isMarried) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.isMarried = isMarried;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", isMarried=" + isMarried +
                '}';
    }
}
