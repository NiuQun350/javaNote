package cn.sxt.oo1;

import java.util.Arrays;
import java.lang.System;

/**
 * 测试java.util.Arrays 工具类的使用
 */

public class TestArrays {
    public static void main(String[] args) {
        // 三种方法打印一个数组
        int[] a = {10, 20, 30};
        System.out.println(Arrays.toString(a));
        for(int i=0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("***********");
        for(int temp:a) {
            System.out.println(temp);
        }

        /*
            // 数组的拷贝
            int[] b = new int[a.length];
            System.arraycopy(a, 0, b, 0, a.length);
            System.out.println(Arrays.toString(b));
        */

        System.out.println("********");
        int[] arr1 = {100, 53, 2, 55, -1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(myBinary(arr1, 2));


    }

    public static int myBinary(int[] arr, int temp) {
        int low = 0;
        int height = arr.length-1;
        while(low <= height) {
            int mid = (low + height) / 2;
            if(temp <  arr[mid])
                height = mid-1;
            if(temp > arr[mid])
                low = mid+1;
            if (temp == arr[mid])
                return mid;
        }
        return -1;
    }

}