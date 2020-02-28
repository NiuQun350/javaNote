package cn.sxt.memberinnerclass;

/**
 * 内部类分为:成员内部类和局部内部类(匿名内部类)
 * 成员内部类定义的格式:
 *  修饰符  class 外部类名称 {
 *      修饰符  class 内部类名称 {
 *          // ...
 *      }
 *      // ...
 *  }
 *  注意：内用外，随意访问(即无论外部类属性和方法的修饰符是什么，内部类都可以直接访问)； 外用内，一定要借助内部类对象
 *
 *  ==================================
 *  如何使用成员内部类？有两种方式
 *  1.间接方式：在外部类的方法中使用内部类，然后在main中只是调用外部类的方法
 *  2.直接方式：即不想创建外部类，直接创建内部类；但是内部类的对象如果想要被创建，肯定要先有外部类对象
 *  直接创建内部类的公式:外部类名称.内部类名称  对象名 = new 外部类名称().new 内部类名称()
 *
 * @author NiuQun
 * @2019/11/20
 */

public class TestInnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody();
        System.out.println("============");

        Body.Heart heart = new Body().new Heart();
        heart.beat();


    }
}
