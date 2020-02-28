import java.util.Arrays;

/**
 * @author NiuQun
 */
public class Divisible {
    private static final int MIN = 200;
    private static final int MAX = 300;

    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;
        for(int i = MIN; i <= MAX; i++) {
            if(i % 6 == 0 && i % 4 != 0) {
                arr[count] = i;
                count++;
            }
        }
        int[] arr1 = new int[count];
        System.arraycopy(arr, 0, arr1, 0, count);
        System.out.printf("%d到%d之间能被6整除但不能被4整除的数为:", MIN, MAX);
        System.out.println(Arrays.toString(arr1));

    }
}
