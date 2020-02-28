package cn.sxt.oo1;

import java.util.Arrays;

public class TestArrayCopy {
    public static void main(String[] args) {
        String[] str1 = {"111", "222", "333", "444", "555"};
        System.out.println(Arrays.toString(removeElement(str1, 1)));


    }

    public static void testBasicCopy() {
        String[] s1 = {"aa", "bb", "cc", "dd", "ee", "ff", "gg"};
        String[] s2 = new String[10];
        System.arraycopy(s1, 2, s2, 3, 2);
        System.out.println(s2[0]);
        System.out.println(s2[1]);
        System.out.println(s2[2]);
        System.out.println(s2[3]);
        System.out.println(s2[4]);
        System.out.printf("***********%n");
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));

        for (int i = 0; i < s2.length; i++) {
            System.out.println(i + ":" + s2[i]);
        }
        for(String temp:s2) {
            System.out.println(temp);
        }
    }
        public static void testBasicCopy2() {
            String[] s1 = {"aa", "bb", "cc", "dd", "ee", "ff", "gg"};
            String[] s2 = new String[7];
            System.arraycopy(s1, 2, s2, 6, 3);
        }

        public static String[] removeElement(String str[], int index) {
            System.arraycopy(str, index+1, str, index, str.length-(index+1));
            str[str.length-1] = null;
            return str;
        }

        public static String[] insertElement(String str[], int index) {
            System.arraycopy(str, index, str, index+1, str.length-index);
            return str;
        }

}
