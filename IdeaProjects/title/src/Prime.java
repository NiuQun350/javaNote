import java.util.Arrays;
/**
 * @author NiuQun
 */
public class Prime {
    private static final int MIN = 101;
    private static final int MAX = 200;

    /**
     * 判断101-200之间有多少个素数,把所有的素数存入数组并输出
     * @param args
     */
    public static void main(String[] args) {
        // 数组primeArr用于存储素数
        int[] primeArr = new int[100];

        // count作为素数个数计数器
        int count = 0;
        for(int n = MIN; n <= MAX; n++) {
            if (true == isPrime(n)) {
                primeArr[count] = n;
                count++;
            }
        }
        int[] primeArr1 = new int[count];
        System.arraycopy(primeArr,0, primeArr1,0, count);

        System.out.printf("101到200之间的素数有%s个%n", count);
        System.out.println("101到200之间的素数为:");
        System.out.println(Arrays.toString(primeArr1));
    }

    /**
     * 判断某个数是否是素数
     *
     * @param   n
     * @return  result
     */
    public static boolean isPrime(int n) {
        boolean result;
        int i;
        for (i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                break;
            }
        }

        if (i > Math.sqrt(n)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

