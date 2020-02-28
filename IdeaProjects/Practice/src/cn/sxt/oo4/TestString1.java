package cn.sxt.oo4;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Arrays;

/**
 * @author NiuQun
 * @2019/10/14
 */

public class TestString1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(Integer.toHexString(sb.hashCode()));
        sb.setCharAt(0, 'h');
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb.indexOf("hello "));
        System.out.println(sb.indexOf("World"));
        System.out.println(sb.length());

        System.out.println("********");






        Integer test1 = Integer.valueOf(5);
        Integer test2 = Integer.valueOf("4343");
        Integer test3 = new Integer(8);

        int a = test1.intValue();
        double b = test1.doubleValue();
        System.out.println(test1);
        System.out.println(test2);

        Integer test4 = 8;

        Integer test5 = Integer.parseInt("7348534");
        System.out.println(test5);

        String str = test5.toString();

        System.out.println("HE" + 4);
        System.out.println(5 + 2);



    }
}
