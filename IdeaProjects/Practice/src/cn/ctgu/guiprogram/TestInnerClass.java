package cn.ctgu.guiprogram;

/**
 *  performance:性能
 * 内部类分为：成员内部类(非静态内部类，静态内部类)， 匿名内部类， 局部内部类
 * 1.成员内部类：成员内部类可以使用public, protected, default, private修饰, 类文件： 外部类$内部类.class
 *   (a)非静态内部类：
 *      (1).非静态内部类必须寄存在一个外部类对象里，因此，如果有一个非静态内部类对象，那么一定存在对应的外部类对象，非静态内部类对象单独属于外部类的某个对象
 *      (2).非静态内部类可以直接访问外部类的成员,但是外部类不能直接访问非静态内部类的成员,即只能内访问外,不能外访问内
 *      (3).非静态内部类不能有静态方法,静态属性和静态初始化块
 *      (4).外部类的静态方法,静态代码块不能访问非静态内部类,包括不能使用非静态内部类定义变量和创建实例
 *      (5).外部类中可以直接实例化内部类
 *      (6).也可以在其他不相关类中实例化内部类,但是需要通过 外部类.内部类  内部类名 = new 外部类().new 内部类() 的方法来创建
 *
 *
 * @author NiuQun
 * @2019/12/21
 */

public class TestInnerClass {
    public static void main(String[] args) {
        // 创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }

}

class Outer {
    private int age = 10;

    public void testOuter() {
        System.out.println("Outer.testOuter方法");
    }

    class Inner {
        private int age = 20;
        public void show() {
            testOuter();

            System.out.println("外部类的成员变量age：" + Outer.this.age);
            System.out.println("内部类的成员变量age:" + this.age);

        }
    }


}
