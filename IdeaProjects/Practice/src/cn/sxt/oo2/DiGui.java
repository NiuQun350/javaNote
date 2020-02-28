package cn.sxt.oo2;

import java.util.Scanner;

public class DiGui {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int temp = scanner.nextInt();
        long d1 = System.currentTimeMillis();
        System.out.printf("%d的阶乘是：%s%n", temp, factorial(temp));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归运算花费时间为：%s%n", d2-d1);
    }

    static long factorial (int n) {
        if(n == 1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
}
