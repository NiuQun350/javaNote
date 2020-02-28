package cn.sxt.oo1;

public class TestString {
    public static void main(String[] args) {

        String s1 = "core java";
        String s2 = "Core java";
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(0));
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf("java"));
        System.out.println(s1.indexOf("apple"));  // return -1
        System.out.println(s1.replace(" ", "$"));
        System.out.println(s1.replace("java", "Java"));
        System.out.println(s1);


        String s3 = "How are you";
        System.out.println(s1.startsWith("How"));
        System.out.println(s3.startsWith("How"));
        System.out.println(s3.endsWith("you"));
        String s4 = s3.substring(2);
        System.out.println(s4);
        String s5 = s3.substring(2,6);
        System.out.println(s5);
        String s6 = s3.toLowerCase();
        System.out.println(s6);
        String s7 = s3.toUpperCase();
        System.out.println(s7);
        System.out.println(s3);

        String s8 = " How are you!  ";
        System.out.println(s8);
        String s9 = s8.trim();
        System.out.println(s9);

        String s10 = "Hello World";

    }
}


