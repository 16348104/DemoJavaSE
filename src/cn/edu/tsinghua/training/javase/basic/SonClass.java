package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by mingfei.net@gmail.com
 * 2016/6/24 10:34
 */
public class SonClass extends FatherClass {
    boolean b;
    int k;

    public SonClass(int i, double d, boolean b) {
        super(i, d);
        this.b = b;
    }

    public SonClass(int i, double d, boolean b, int k) {
        super(i, d);
        this.b = b;
        this.k = k;
    }

    void m2() {

    }
}
