package cn.niuke.test;
/**
 * 题目描述
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 *
 * 输出描述:
 * 输出到长度为8的新字符串数组
 *
 * @author NiuQun
 * @2019/10/28
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            for (int i = 0; i < str.length(); i += 8) {
                if (str.length() - i >= 8) {
                    System.out.println(str.substring(i, i + 8));
                } else {
                    StringBuilder sb = new StringBuilder("00000000");
                    int t = 0;
                    for (int j = i; j < str.length(); j++) {

                        sb.setCharAt(t++, str.charAt(j));
                    }
                    System.out.println(sb);
                }
            }
        }
    }
}