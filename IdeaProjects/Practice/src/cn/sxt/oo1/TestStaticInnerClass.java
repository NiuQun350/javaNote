package cn.sxt.oo1;

/**
 * 静态内部类:
 *          1.当一个静态内部类对象存在，并不一定存在对应的外部类对象，因此，静态内部类的实例方法不能直接访问外部类的实例方法；
 *          2.静态内部类看作外部类的一个静态成员，因此，
 *          3.外部类的方法中可以通过："静态内部类.名字"的方式访问静态内部类的静态成员，通过new静态内部类()访问静态内部类的实例
 *
 *
 */
/*public class TestStaticIntelClass {
    public static void main(String[] args) {
        Outer2 outer2 = new Outer2();     // 创建外部类对象
        Outer2.Inner2 inner2 = new Outer2.Inner2();   // 创建内部类对象
        inner2.test1();
        System.out.println(inner2.age);
        System.out.println(inner2.name);
    }
}

class Outer2 {
    int abd;
    public void test() {
        System.out.println("静态内部类的静态成员：" + Inner2.num);
        Inner2.test2();            // 静态内部类的静态方法

        System.out.println("静态内部类的普通属性" + new Inner2().age);
        new Inner2().test1();     // 静态内部类的普通方法
    }
    static class Inner2{
        int age;
        String name;
        static String num;
        static {
            String num = "Jone";
        }
        public void test1() {
            System.out.println("静态内部类的普通方法");
        }
        public static void test2() {
            System.out.println("静态内部类的静态方法");
        }
    }
} */