package cn.sxt.oo1;

/**
 * 非静态内部类：
 * 编译以后会产生两个.class文件, 外部类.class 和 外部类$内部类.class
 * Java中类主要分为：成员内部类(非静态内部类，静态内部类)，匿名内部类，局部内部类
 * 成员内部类可以用private,default,protected,public任意进行修饰
 * 非静态内部类:(外部类里使用非静态内部类和平时使用其他类没有什么区别)
 *            1.非静态内部类可以直接访问外部类的成员，但是外部类不能直接访问非静态内部类的成员
 *            2.非静态内部类必须寄存在一个外部类对象中，因此，如果有一个非静态内部类对象，那么一定存在一个对应的外部类对象
 *            3.非静态内部类对象单独属于外部类的某个对象
 *            4.非静态内部类不能有静态方法，静态属性和静态初始化块
 *            5.外部类的静态方法，静态代码块不能访问非静态内部类，包括不能使用非静态内部类定义变量,创建实例
 *            6.非静态内部类的唯一作用就是服务与其对应的外部类，访问其外部类的属性和方法
 * 成员变量访问要点: 1.内部类里方法的局部变量:变量名
 *                2.内部类属性:this.变量名
 *                3.外部类属性:外部类名.this.变量名
 */
public class TestNotStaticInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();  // 创建外部类

        Outer.Inner inner = new Outer().new Inner();   // 创建内部类对象
        inner.show();

    }
}

class Outer {
    private int age = 10;
    // 外部类构造方法
    public Outer() {
        super();
    }
    public void testOuter() {
        System.out.println("Outer.testOuter()");
    }
    // 内部类构造方法
    class Inner {
        int age = 20;
        public Inner() {
            super();
        }
        public void show() {
            // 通过内部类访问外部类
            int age = 30;

            Outer.this.testOuter();
            System.out.println("外部类的成员变量：" + Outer.this.age);

            this.show();
            System.out.println("内部类的成员变量：" + this.age);

            System.out.println("局部变量：" + age);
        }
    }
}

