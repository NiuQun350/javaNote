package cn.ctgu.guiprogram;

/**
 * 2.静态内部类：
 *   (1).当一个静态内部类对象存在，并不一定存在对应的外部类对象，因此，静态内部类的实例方法不能直接访问外部类的实例方法
 *   (2).静态内部类看作外部类的一个静态成员，因此，外部类的方法中可以通过：“静态内部类.名字”的方式访问静态内部类的静态成员，通过new 静态内部类() 访问静态内部类的实例
 *   (3).在不相干类中实例化静态内部类的方式： 外部类.静态内部类 静态内部类名 = new 外部类.静态内部类()
 * @author NiuQun
 * @2019/12/21
 */


public class TestInnerClass1 {
    Outer1.Inner1 inner1 = new Outer1.Inner1();

}

class Outer1 {

    static class Inner1 {

    }
}
