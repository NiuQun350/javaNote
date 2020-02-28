package cn.sxt.oo1;

/**
 * 类的继承，只能单继承，不能多继承
 * 类分抽象类和普通类
 * class A{}
 * class B extends A{}
 *
 * class abstract A{}
 * class B extends A{}
 */
public class TestAbstract {
    public static void main(String[] args) {

        int a;
        Animal animal = new Dog();   //抽象类不能创建实例，但是可以用于声明引用变量类型
        animal.shout();              //编译器将animal当作Animal类类型来处理，因此它在编译时通过
        // animal.test();            //编译器不认识test()方法，因为编译器将animal当作Animal类型来处理，而Animal类中
                                     //没有test()方法
    }
}
/**
 * 抽象类的意义在于：为子类提供统一的，规范的模板，子类必须实现相关的抽象方法
 * 抽象方法：
 * 使用abstract修饰的方法，没有方法体，只有声明，定义的是一种”规范“，就是告诉子类必须要给抽象方法提供具体的实现
 * 抽象类：
 * 包含抽象方法的类，通过abstract方法定义规范，然后要求子类必须定义具体实现
 * 通过抽象类，我们就可以做到严格限制子类的估计，使子类之间更加通用
 * 抽象类和实现类之间是父子关系
 */
abstract class  Animal{
    // super();                         // 不能在开头写super, 因为抽象类不是由Object类继承来的
    Animal(){};                        // 抽象类可以有自己的构造方法
    public abstract void shout();     // 抽象类中定义有抽象方法
/*    public void test(){              // 抽象类中也可以有普通方法
        System.out.println("test");
    } */
}

/** 定义抽象类的详细说明：
 * 1.抽象类没有实现， 其子类必须实现（指的是方法）
 * 2.有抽象方法的类只能定义成抽象类
 * 3.抽象类不能被实例化，即不能用new来实例化抽象类，
 * 4.抽象类中可以包含属性，方法，构造方法.  但是构造方法不能用new来实例，只能被子类调用
 * 5.抽象类只能被用来继承
 * 6.抽象方法必须被子类实现
 * 7.抽象类不能创建实例，但是可以用于声明引用变量类型
 */

class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("狗叫");
    }
    public void test() {
        System.out.println("测试");
    }
}