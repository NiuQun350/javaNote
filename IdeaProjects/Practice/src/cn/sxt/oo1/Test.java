package cn.sxt.oo1;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);
        // System.out.println('%n');   // error
        System.out.println('\n');
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

        Scanner scanner = new Scanner(System.in);
        String a1 = scanner.nextLine();
        System.out.println(a1);
        String a2 = scanner.nextLine();
        System.out.println(a2);

    }
}

