package cn.sxt.generic;

/**
 * @author NiuQun
 * @2019/9/14
 */

public class TestWrapperClass2 {
    public static void main(String[] args) {
        // 基本数据类型转换成包装类
        Integer a = new Integer(5);
        Integer b = Integer.valueOf(5);

        // 包装类转换成基本数据类型
        int c = a.intValue();
        double d = a.doubleValue();



        // String类转换成包装类
        Integer e = Integer.valueOf("3343");
        Integer f = new Integer("3434");
        Integer g = Integer.parseInt("233");
        // 包装类转换成String
        String h = e.toString();


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);




    }




}
