package cn.sxt.oo1;

/**
 * 接口的实现：实现类可以实现多个父接口
 * interface A{}     //前边的访问修饰符必须是 public或者默认，其中的方法只能是抽象方法，不能有普通方法和构造方法
 *                   //接口中的方法必须时public abstract，不写也是
 *                   //接口中的属性必须是public static final, 不写也是
 * interface B{}
 * class C implements A, B{}
 */
public class TestInterface1 {
    public static void main(String[] args) {
        Volant v = new Angel();     // 自动向上转型
        // 接口不能创建实例，但是可以用于声明引用变量类型，
        // 这里编译器把Angle类实例化的对象v当成Volant接口类型的对象
        v.fly();
        // v.helpOther();  error
        /**
         * 编译器将对象v当作Volant接口类型的对象来处理
         * 由于Volant类中有fly()方法而没有helpOther()方法，因此编译器不认识helpOther()方法，编译时报错
         * 在运行的过程中系统才知道调用的是Angle类类型的方法，而不是Volant接口类型的方法
         */
    }
}

// 飞行接口
interface Volant {
    int FLY_HEIGHT = 1000;
    void fly();
}
// 善良接口
interface Honest {
    void helpOther();
}
// 天使类 实现了 善良接口 和 飞行接口
class  Angel implements Volant, Honest {    // 实现类可以实现多个父接口，
    @Override
    public void fly() {
        System.out.println("Angel.fly()");
    }

    @Override
    public void helpOther() {
        System.out.println("Angel.helpOther()");
    }
}

// 好人类 实现了 善良接口
class GoodMan implements Honest {
    @Override
    public void helpOther() {
        System.out.println("GoodMan.helpOther()");
    }
}

// 鸟人类 实现了 飞行接口
class BirdMan implements Volant {
    @Override
    public void fly() {
        System.out.println("BirdMan.fly()");
    }
}