package cn.niuqun.javasource;
import java.util.Random;
/**
 * @author NiuQun
 * @2020/2/22
 */

public class Anonymous {
    public static void main(String[] args) {
        Random random = new Random();
        /*
        获取的随机数number1范围为int的取值范围
         */
        int number1 = random.nextInt();
        System.out.println(number1);

        /*
        区间为：左闭右开
        随机数number2的范围为：[0, 10)
         */
        int number2 = random.nextInt(10);
        System.out.println();

        int[] array = new int[3];
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        test1();
    }

    public static void test() {
        System.out.println("");
    }

    public static boolean isSame(short i, short j) {
        return i == j;
        }

    public static void test1() {
        byte[] arr0 = new byte[3];
        System.out.println(arr0);
        int[] arr1 = {1, 3, 4};
        System.out.println(arr1);
        Object[] arr2 = new Object[5];
        System.out.println(arr2);
        String[] arr3 = new String[4];
        System.out.println(arr3);


    }


}
