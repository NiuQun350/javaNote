package cn.sxt.localinnerclass;

/**
 * 类的权限修饰符：
 * public > protected > (default) > private
 * 一、为什么不能用private修饰Java外部类？
 * 因为如果使用private修饰Java外部类，那么这个类不能创建实例，这个类的属性和方法不能被访问，那么创建这个类毫无意义，所以不能使用private修饰Java外部类。
 *
 * 二、为什么不能用protected修饰Java外部类？
 * 举个例子，如果类A用protected修饰，与类A不同包的类B想要访问类A的话，类B就必须是继承类A的（或者说类B必须为类A的子类），但是类B继承类A的前提又是类B可以访问到类A，有点绕对吧，仔细想想会发现这里是冲突的，其实这就说明了为什么不能用protected来修饰外部类。再说，protected是用来表示在继承关系中的访问权限的，在同一个包和子类中都可以访问，因为继承就是为了拥有父类的属性和方法，所以protected是用于修饰类的方法和属性的，也就是说，我想要这个类的属性和方法可以被任何子类继承，我就用protected。我想要这个类的属性和方法不能被任何子类继承，我就用private（有点强词夺理哈。。。）。同理，我想要这个类被继承，我就用abstract。我不想这个类被继承，我就用final。所以，用protected修饰类有什么意义呢？关键点还是在于第一句话，protected是用来表示在继承关系中的访问权限的！！！
 *
 * 定义一个类的时候，权限修饰符规则：
 * 1.外部类：public / (default) 不能用protected或者private修饰
 * 2.成员内部类：public / protected / (default) / private
 * 3.局部内部类：什么都不能写，但是并不是default的含义，因为default是本包中都可以访问，但是局部内部类只能在本方法中有效
 * @author NiuQun
 * @2019/11/20
 */

public class DemoMain {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.methodOuter();
    }
}
