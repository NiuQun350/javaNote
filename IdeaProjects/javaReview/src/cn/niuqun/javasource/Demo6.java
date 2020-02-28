package cn.niuqun.javasource;

import java.util.Arrays;

/**
 * @author NiuQun
 * @2020/2/27
 */

public class Demo6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        System.out.println(fromArrayToString(array));
    }

    public static String fromArrayToString(int[] intArray) {
        String[] str = new String[intArray.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = "word" + (Integer) intArray[i];
            System.out.println(str[i]);
        }
        String str1 = Arrays.toString(str);
        String str2 = str1.replace(",", "#");
        return str2;
    }

    public static String fromArrayToString1(int[] intArray) {
        String str = "[";
        for (int i = 0; i < intArray.length; i++) {
            if (i == intArray.length - 1) {
                str += "word" + intArray[i] + "]";
            } else {
                str += "word" + intArray[i] + "#";
            }

        }
        return str;
    }
}