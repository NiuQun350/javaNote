package cn.sxt.oo4;

import java.lang.Math;
import java.util.Random;

/**
 * Math类的常用方法:
 * max(double x, double y)
 * min(double x, double y)
 * ceil(double x)  // 返回大于x的最小整数 即向上取整
 * floor(double x)  // 返回小于x的最大整数 即向下取整
 * long round(double x)  double类型的数据x转化成long型的数据（四舍五入）
 * int round(float x)
 * toDegrees(double angrad) 弧度->角度
 * toRadians(double angdeg) 角度->弧度
 *
 * Math.random() 可以用于生成随机数,但是我们通常需要的随机数范围并不是[0,1) 之间的double类型数据，这就需要对其进行一些复杂的运算
 * 因此我们可以使用Random类来专门产生随机数, 并且Math.random()底层调用的就是Random的nextDouble()方法
 *
 * @author NiuQun
 * @2019/10/16
 */

public class TestMath {
    public static void main(String[] args) {
        System.out.println(Math.ceil(4.3));
        System.out.println(Math.floor(4.3));
        System.out.println(Math.round(4.5434343));
        System.out.println(Math.toDegrees(Math.PI));
        System.out.println(Math.toRadians(360));
        System.out.println(Math.E);
        System.out.println("***********************");

        Random rand = new Random();
        // 随机产生[0,1)之间的double类型的数据
        System.out.println(rand.nextDouble());
        // 随机产生[0,1)之间的int类型的数据
        System.out.println(rand.nextInt());

        System.out.println(rand.nextFloat());
        System.out.println(rand.nextBoolean());
        System.out.println(rand.nextLong());

        // 随机产生[0,10)之间的int类型的数据
        System.out.println(rand.nextInt(10));
        // 随机产生[20,30)之间的int类型的数据
        System.out.println(20 + rand.nextInt(10));




    }


}
