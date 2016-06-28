package cn.edu.tsinghua.training.javase.basic;

/**
 * Created by Administrator
 * 2016/6/28.
 */
public class FinalTest {

    private static final int ONE_TWO_THREE = 123; // constant 常量

    public FinalTest(int i) {
//        this.i = i;
    }

    public final void method() {
//Math math = new Math();
        Math.abs(1);
    }
}

class SubFinalTest extends FinalTest {

    public SubFinalTest(int i) {
        super(i);
    }

//    @Override
//    public void method() {
//        System.out.println("...");
//    }
}
