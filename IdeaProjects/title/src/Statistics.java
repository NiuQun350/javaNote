import java.util.Scanner;
/**
 *
 * @author NiuQun
 */
public class Statistics {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n = scanner.nextInt();
        System.out.println("请依次输入n个整数:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        statistics(arr);
    }

    /**
     * 统计正数,负数,零的个数
     *
     * @param arr
     */
    public static void statistics(int[] arr){
            int negativeNumCount = 0;
            int positiveNumCount = 0;
            int zeroCount = 0;
            for(int temp:arr) {
                if(temp < 0) {
                    negativeNumCount++;
                } else if(temp > 0) {
                    positiveNumCount++;
                } else {
                    zeroCount++;
                }
            }
            System.out.println("正数个数为:" + positiveNumCount);
            System.out.println("负数个数为:" + negativeNumCount);
            System.out.println("零的个数为:" + zeroCount);
        }
}

