package cn.sxt.oo2;

import java.util.Scanner;

public class DiGui1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int temp = scanner.nextInt();

        Accumulate test = new Accumulate(temp);
        System.out.println(test.factorial(test.getBasic()));
    }
}

class Accumulate {
    private int basic;

    public Accumulate(int basic) {
        super();
        this.basic = basic;
    }

    public int getBasic() {
        return basic;
    }

    public long factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

}