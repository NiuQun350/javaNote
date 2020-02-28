package cn.sxt.oo4;
import java.lang.System;
import java.lang.String;
import java.lang.Math;
import java.lang.Object;
import java.lang.Number;


import java.util.Arrays;

/**
 * @author NiuQun
 * @2019/10/14
 */

public class TestArray {
    public static void main(String[] args) {
        // System类里包含了一个static void arraycopy的(object src, int srcpos, object dest, int destpos, int length)的方法
        // 该方法可以将src数组中的元素赋值给dest数组, 其中srcpos指定从src数组的第几个元素开始赋值，length参数指定将src数组的多少个元素赋值给dest数组的元素
        String[] s = {"阿里巴巴", "腾讯", "百度", "谷歌", "搜狐"};
        String[] s1 = new String[6];
        System.arraycopy(s, 1, s1, 1, 3);
        int[] arrInt1 = new int[]{34, 0, 90, -1, 434, 898};
        int[] arrInt2 = new int[10];
        System.arraycopy(arrInt1, 2, arrInt2, 4, 3);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(arrInt2));
        int[] arrInt3 = new int[]{434, -34, 0, 988, 200};
        Arrays.sort(arrInt3);
        System.out.println(Arrays.toString(arrInt3));
        System.out.println(Arrays.binarySearch(arrInt3, 0)) ;

    }
}
