package cn.sxt.memberinnerclass;

/**
 * @author NiuQun
 * @2019/11/20
 */

public class Outer {
    /**
     * 外部类的成员变量
     */
    int number = 10;
    public class Inner {
        /**
         * 内部类的成员变量
         */
        int number = 20;

        public void methodInner() {
            // 内部类方法的局部变量
            int number = 30;
            System.out.println(number);  // 内部类方法的局部变量,就近原则
            System.out.println(this.number); // 内部类的成员变量
            System.out.println(Outer.this.number); // 外部类的成员变量
        }
    }
}
