# *不开创新的数组实现原数组反转

```
public class Demo1 {
    public static void main(String[] args) {
        /**
         * 不开创新的数组实现原数组反转
         */
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println(arr1);

        System.out.println("+++++++++++++++++++++");
        for (int temp : arr1) {
            System.out.println(temp);
        }
        System.out.println("+++++++++++++++++++++");
        System.out.println(Arrays.toString(arr1));
        for (int min = 0, max = arr1.length - 1; min < max; min++, max--) {
            int temp = arr1[min];
            arr1[min] = arr1[max];
            arr1[max] = temp;
        }
        System.out.println(arr1);

        System.out.println("+++++++++++++++++++++");
        for (int temp : arr1) {
            System.out.println(temp);
        }
        System.out.println("+++++++++++++++++++++");
        System.out.println(Arrays.toString(arr1));
    }
}
```