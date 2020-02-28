package cn.sxt.oo1;

/**
 * 匿名内部类:(适合那种只需要使用一次的类，比如键盘听操作)
 *          1.匿名内部类没有访问修饰符
 *          2.匿名内部类没有构造方法，因为它连名字都没有
 */

public class TestAnonymousInnerClass {
    public static void main(String[] args) {

        }

    public static void test01(AA a) {
        a.aa();
    }
}



interface  AA {
    /*public abstract */void aa();
}
