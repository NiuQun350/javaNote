import java.util.Arrays;

/**
 * @author NiuQun
 */
public class Multiple {
    private static final int MAX = 100;
    public static void main(String[] args) {
        int[] arr = new int[MAX];
        int count = 0;
        int sum = 0;

        for(int i = 0; i <= MAX; i++) {
            if(i % 6 == 0) {
                arr[count] = i;
                count++;
                sum += i;
            }
        }
        int[] arr1 = new int[count];
        System.arraycopy(arr, 0, arr1, 0, count);
        System.out.printf("%d以内的6的倍数有:%n", MAX);
        System.out.println(Arrays.toString(arr1));
        System.out.printf("其和为:%d%n", sum);

    }
}
