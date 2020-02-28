package cn.ctgu.guiprogram;

/**
 * 3.匿名内部类
 *   (1).匿名内部类没有访问修饰符
 *   (2).匿名内部类适合那种只使用一次的类,比如监听器
 *   (3).匿名内部类没有构造方法,因为它连名字都没有
 * @author NiuQun
 * @2019/12/21
 */

public class TestAnonymousInnerClass {
    public static void main(String[] args) {
        test01(new A() {
            @Override
            public void aa() {
                System.out.println("这是一个匿名内部类");
            }
        });
    }

    public static void test01(A a) {
        a.aa();
    }
}


interface A {
    void aa();
}