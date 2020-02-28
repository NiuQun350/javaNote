import java.util.Scanner;
/**
 * @author NiuQun
 */
public class Sum {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n的值:");
        int n = scanner.nextInt();
        System.out.printf("1-%d之间奇数之和为:%d%n", n, oddNumSum(n));
        System.out.printf("1-%d之间个位是3或5的数字之和:%d%n", n, sum(n));
    }


    /**
     * 求1-n之间所有的奇数之和
     *
     * @param n
     * @return sum
     */
    public static int oddNumSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * 1-%d之间个位是3或5的数字之和:%d
     *
     * @param  n
     * @return sum
     */
    public static int sum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            if(i % 5 == 0 && i % 10 != 0 || i % 10 == 3) {
                sum += i;
            }
        }
        return sum;
    }
}
