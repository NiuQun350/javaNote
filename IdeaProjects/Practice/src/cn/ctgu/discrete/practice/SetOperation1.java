package cn.ctgu.discrete.practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author NiuQun
 * @2019/12/13
 */

public class SetOperation1 {
    public static void main(String[] args) {
        HashSet<String> SetA = new HashSet<>();
        HashSet<String> SetB = new HashSet<>();
        HashSet<String> SetC = new HashSet<>();
        HashSet<String> SetD = new HashSet<>();
        HashSet<String> SetE = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input elements of A(按回车后读取每行输入的有效数据及自动结束):");
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            } else {
                SetA.add(str);
            }
        }
        System.out.println("SetA" + SetA);
        System.out.println("Please input elements of B(按回车后读取每行输入的有效数据及自动结束):");
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            } else {
                SetB.add(str);
            }
        }
        System.out.println("SetB:" + SetB);

        SetC.addAll(SetA);
        SetC.addAll(SetB);
        System.out.println("A+B=" + SetC);

        // System.out.println(SetA.removeAll(SetB));
        // System.out.println(SetA);

        SetD.addAll(SetA);
        SetD.retainAll(SetB);
        System.out.println("A*B=" + SetD);

        SetE.addAll(SetA);
        SetE.removeAll(SetB);
        System.out.println("A-B=" + SetE);
    }
}

