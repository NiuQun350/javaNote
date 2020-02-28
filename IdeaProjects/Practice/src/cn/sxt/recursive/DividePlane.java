package cn.sxt.recursive;

import java.util.Scanner;

/**
 * 平面上n条直线最多能把平面划分成多少部分
 * @author NiuQun
 * @2019/10/16
 */

public class DividePlane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入直线数目：");
        int lineNumber = scanner.nextInt();
        int[] result = new int[lineNumber+1];
        System.out.printf("%d条直线最多可以将一个平面分割成%d个部分", lineNumber, dividePlane(result));

    }

    public static int dividePlane(int[] result ) {
        result[0] = 1;
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i-1] + i;
        }
        return result[result.length-1];
    }

}
