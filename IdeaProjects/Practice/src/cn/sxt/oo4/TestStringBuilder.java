package cn.sxt.oo4;

/**
 * @author NiuQun
 * @2019/10/15
 */

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char temp = (char)('a' + i);
            sb1.append(temp);
        }

        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);
        sb1.setCharAt(5, ';');
        System.out.println(sb1);
        System.out.println(sb1.length());
        sb1.setLength(34);
        System.out.println(sb1.length());

        String string = "";
        // 获取系统的当前剩余空间
        long num1 = Runtime.getRuntime().freeMemory();
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            string = string + i;
        }

        long num2 = Runtime.getRuntime().freeMemory();
        long time2 = System.currentTimeMillis();

        System.out.println("String占用内存：" + (num2 - num1));
        System.out.println("String占用时间：" + (time2 - time1));

        StringBuilder stringBuilder = new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory();
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            stringBuilder.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory();
        long time4 = System.currentTimeMillis();
        System.out.println("StringBuilder占用内存：" + (num4 - num3));
        System.out.println("StringBuilder占用时间：" + (time4 - time3));



    }
}
