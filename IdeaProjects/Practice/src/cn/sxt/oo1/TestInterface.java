package cn.sxt.oo1;

/**
 * 接口是比“抽象类”更”抽象“的”抽象类“，接口全面专业的实现了：规范和具体实现的分离
 * 接口中所有的方法都是抽象方法
 * 接口不提供任何实现（但是抽象类提供某些具体实现）
 * 接口和实现类不是父子关系，是实现规则关系，
 */
public interface TestInterface {
    // super();            // 不能在开头写super(), 因为接口不是由Object类继承来的
    //TestInterface();    // 接口不能有自己的构造方法
    /*public static final*/ int MAX_AGE = 100;
    /*public abstract*/ void test1();
}

/**
 * 定义接口的详细说明：
 * 1.访问修饰符：只能是public或默认
 * 2.接口名：和类名采用同样的命名规则
 * 3.extends： 接口可以多继承
 * 4.常量：接口中的属性只能是常量，总是：public static final. 不写也是
 * 5.方法：接口中的方法只能是：public abstract. 省略的话也是
 * 要点：
 * 1.子类通过implements来实现接口中的规范
 * 2.接口不能创建实例，但是可以用于声明引用变量类型
 * 3.一个类实现了接口，必须实现接口中的所有方法，并且这些方法也只能是public的   ////重点
 * 4.JDK1.7之前，接口中只能包含静态常量，抽象方法，不能有普通属性，构造方法，普通方法
 */

class MyClass1 implements TestInterface {

    @Override
    public void test1() {
        System.out.println("最大年龄;" + MAX_AGE);
        System.out.println("TestInterface");
    }
}
