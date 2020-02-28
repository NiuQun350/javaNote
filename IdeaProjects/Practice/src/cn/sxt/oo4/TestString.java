package cn.sxt.oo4;

/**
 * @author NiuQun
 * @2019/10/14
 */

public class TestString {
    public static void main(String[] args) {
        // s1, s2位于常量池中
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = new String("Hello World");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);


        String s4 = "core Java";
        String s5 = "Core Java";
        // charAt() 方法返回该索引处的值
        System.out.println(s4.charAt(7));
        // length() 方法返回该字符串的长度
        System.out.println(s4.length());
        // equals() 方法判断s4和s5的值是否相等
        System.out.println(s4.equals(s5));
        // equalsIgnoreCase() 方法:在忽略大小写的情况下，判断s4和s5的值是否相等
        System.out.println(s4.equalsIgnoreCase(s5));
        // indexOf() 方法返回字符串中第一次出现给定字符串时的索引位置, 若没有, 则返回-1
        System.out.println(s4.indexOf("java"));
        System.out.println(s4.indexOf("Java"));
        // replace() 方法将字符串中所有第一个参数的字符换成第二个参数的字符
        String s6 = s4.replace(" ", "*");

        System.out.println(s6);

        // startsWith() 方法用于判断字符串是否由参数中的字符串开头
        // endsWith() 方法用于判断字符串是否由参数中的字符串结尾
        System.out.println(s4.startsWith("java"));
        System.out.println(s4.endsWith("java"));

        // substring() 方法截取字符串指定长度
        String s7 = s4.substring(1);
        String s8 = s4.substring(3, 5);
        // toUpperCase() 方法将字符串中的字母全转成大写
        // toLowerCase() 方法将字符串中的字母全转成小写
        s4.toUpperCase();
        s5.toLowerCase();

        String s9 = " Hello World! ";
        // trim() 方法用于去除首尾的空格, 中间的空格不会去掉
        String s10 = s9.trim();
        System.out.println(s10);
        System.out.println("************");

        String str = "Hello world";
        String str1 = str.replace("Hello", "hello");
        System.out.println(str1);


        System.out.println("$$$$$$$$$$$$$$$");
        String str2 = "HELLO WORLD HELLO WORLD HELLO WORLD";
        String str3 = str2.replaceFirst("HELLO", "hello");
        System.out.println(str3);

        String str4 = str2.replace("HELLO", "hello");
        System.out.println(str4);
        String str5 = str2.replaceAll("HELLO", "hello");
        System.out.println(str5);


        String strr = "HELLO WORLD HELLO WORLD hello world";
        String strr1 = strr.toLowerCase();
        System.out.println(strr1);
        String strr2 = strr.substring(1);
        System.out.println(strr2);
        String strr3 = strr.trim();
        System.out.println(strr);
        System.out.println(strr3);



    }
}
