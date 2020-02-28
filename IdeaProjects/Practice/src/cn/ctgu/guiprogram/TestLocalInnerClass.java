package cn.ctgu.guiprogram;

/**
 * 4.局部内部类:
 *     (1).局部内部类是定义在方法内部的类,作用于仅限于本方法,称为局部内部类
 *     (2).局部内部类的使用主要是用来解决比较复杂的问题,想创建一个类来辅助我们的解决方案,但是又不希望这个类不能在其他的地方使用,所以就产生了局部内部类
 *     (3).局部内部类和成员内部类一样被编译,只是它的作用域发生了变化,它只能在该方法中被使用,出了该方法就会失效
 *     (4).局部内部类前边不能有修饰符
 *
 * @author NiuQun
 * @2019/12/21
 */


public class TestLocalInnerClass {
    public void show() {

        class Inner {
            public void fun() {
                System.out.println("局部内部类的方法");
            }
        }

        new Inner().fun();

    }

    public static void main(String[] args) {
        new TestLocalInnerClass().show();
    }
}

