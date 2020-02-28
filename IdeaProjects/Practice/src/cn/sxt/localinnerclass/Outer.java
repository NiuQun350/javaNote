package cn.sxt.localinnerclass;

/**
 * 如果一个类是定义在一个方法内部的，那么这就是一个局部内部类
 * 只有当前所属的方法才能使用它，出了这个方法，外边就不能用了
 * 定义格式:
 * 修饰符  class 外部类名称 {
 *     修饰符 返回子类型 外部类方法名称(参数名称) {
 *         class 局部内部类名称 {
 *
 *         }
 *
 *     }
 * }
 *
 * 局部内部类如果想访问所在方法的局部变量，那么这个局部变量必须是【有效的final】
 * 从java 8开始，只要局部变量事实不变，那么final关键字就可以省略
 * 原因：生命周期不一样
 * 1.new出来的对象在对内存中，
 * 2.局部变量在栈内存中，它是跟着方法走的
 * 3.方法运行结束后，立刻出栈，局部变量就会立刻消失，
 * 4.但是new出来的对象会在堆内存中持续存在，直到垃圾回收后才消失
 * @author NiuQun
 * @2019/11/20
 *
 */

public class Outer {
    int number = 20;
    public void methodOuter() {
        /**
         * 局部内部类
         */
        class Inner {
            int number = 10;
            public void methodInner() {
                System.out.println(number); // 10
            }
        }
        // 只能在该方法内部创建局部内部类对象
        Inner inner = new Inner();
        inner.methodInner();
    }
}
