package cn.sxt.oo3;

/**
 * @author NiuQun
 * @2019/10/10
 */

public class TestThis {
    private int a, b, c;

    public TestThis(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }

    public TestThis(int a, int b, int c) {
        this(a, b);
        this.c = c;
    }

    public static void test() {
        System.out.println("dfdsfdfs");
    }

}

class test {
    public static void main(String[] args) {
        TestThis testThis = new TestThis(1, 2, 3);
        TestThis.test();

    }
}
