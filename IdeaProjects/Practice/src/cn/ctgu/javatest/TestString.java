package cn.ctgu.javatest;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author NiuQun
 * @2019/11/22
 */

public class TestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串(其中含有大小写字母.数字.特殊符号)：");
        String str = scanner.nextLine();

        System.out.println(removeNonLetter(str));
        CountEveryLetterNumbers(str);


    }

    /**
     * 去除一个字符串中所有的非英文字符
     *
     * @param str
     * @return String
     */
    public static String removeNonLetter(String str) {
        String str1 = str.replaceAll("[^a-zA-Z]", "");
        return str1;
    }

    public static void CountEveryLetterNumbers(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>(16);
        for (int i = 0; i < 26; i++) {
             hashMap.put((char)('a' + i), 0);
             char regex1 = ((char)('a' + i));
             char regex2 = ((char)('A' + i));

            // System.out.println(str.replaceAll(regex1|regex2, "").length());
        }

        }




}



