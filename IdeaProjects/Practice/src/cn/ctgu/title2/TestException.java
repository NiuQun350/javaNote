package cn.ctgu.title2;

import java.util.Scanner;

/**
 * @author NiuQun
 * @2019/11/8
 */

public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of the student:");
        String strNumber = scanner.nextLine();
        Student student1 = new Student(strNumber);


    }

}
