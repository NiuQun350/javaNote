package cn.sxt.oo4;

// import java.sql.Date;
import java.util.Date;
/**
 * @author NiuQun
 * @2019/10/15
 */

public class TestDate {
    public static void main(String[] args) {
        // 如果Date() 不传入参数, 则默认在内部调用构造方法1
        // 如果Date() 传入参数, 则默认在内部调用构造方法2, 传入的参数是毫秒数, 重1970年1月1日 0时0分0秒开始计算
        // 当然要注意时序, 北京时间比格林尼治晚8个小时
        Date d = new Date();

        // currentTimeMillis() 方法返回当前时刻的毫秒数
        // Date类内部的构造方法如下： 同时也有很多重载构造方法, 其中包括带参数的构造方法

        // 1：
        // public Date() {
        //     this(System.currentTimeMillis());
        //}

        // 2：
        // public Date(long date) {
        //     this.fastTime = date;
        // }

        // System.out.println(d);

        // getTime() 方法用于获得自1970年1月1日 00:00:00 GMT以来自现在的毫秒数
        System.out.println(d.getTime());

        Date d2 = new Date();
        Date d3 = new Date();
        // 测试时间d3是否在时间d2之后
        System.out.println(d3.after(d2));
        // 测试时间d3是否在时间d2之后
        System.out.println(d3.before(d2));
        // 测试时间d3是否与时间d2相等
        System.out.println(d3.equals(d2));
        // 该方法把Date对象转换成以下的形式
        // dow mon dd hh:mm:ss zzz yyyy 其中: dow时一周中的某一天(Sun, Tue, Wed, Thu, Fri, Sat)
        System.out.println(d3.toString());

        System.out.println(d2);
        System.out.println(d3);
    }
}
