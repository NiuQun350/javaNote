package cn.sxt.oo1;

import java.util.Arrays;

public class TestBinary {
    public static void main(String[] args) {
        Object[] a1 = {"1001", "小明", 100};
        Object[] a2 = new Object[]{"1002", "大明", 110};
        Object[][] temp = new Object[2][];
        temp[0] = a1;
        temp[1] = a2;
        for(Object[] t:temp)
            System.out.println(Arrays.toString(t));

        int[] b1 = {1, 3, 4, 5};
        System.out.println(Arrays.toString(b1));

        Object[][] a3 = {
                {"1001", "小明", 100},
                {"1002", "大明", 110},
        };
        for(int i = 0; i < a3.length; i++)    // length计算的是一维数组的长度
            System.out.println(Arrays.toString(a3[i]));
    }

}

