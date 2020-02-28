package cn.sxt.generic;

/**
 * @author NiuQun
 * @2019/9/14
 * 包装类：除了Character和Boolean以外，其他六个类都是数字型，数字型都是java.lang.Number的子类，Number类是抽象类
 * 因此它的抽象方法都需要提供实现，Number类提供了抽象方法：intValue(), longValue(), floatValue(), doubleValue()
 * 这些方法在六个类中都进行了实现，因此所有的“数字型”都可以相互转型(即所有的数字包装类型之间都可以相互转换)
 */

public class TestWrapperClass {
    public static void main(String[] args) {
        // 基本数据类型转换成包装类对象
        Integer a = new Integer(1);
        Integer b = Integer.valueOf(3);

        // 把包装类对象转成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();



        // 把字符串转成包装类对象
        Integer e = new Integer("999");
        Integer f = Integer.valueOf("999");

        // 把包装类对象转成字符串

        String str = f.toString();


    }
}
