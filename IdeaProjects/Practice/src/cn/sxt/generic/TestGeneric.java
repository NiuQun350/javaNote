package cn.sxt.generic;


/**
 * @author NiuQun
 * @2019/9/14
 */

public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<String>(5);

        myCollection.set("小明", 0);
        System.out.println(myCollection.get(0));

        String b = myCollection.get(0);

        char[] arr1 = new char[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 'e';
        }
        System.out.println(arr1);

        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
        }
        System.out.println(arr2);


    }
}

class MyCollection<T> {
    private Object[] arr;
    private int maxSize;

    /**
     * 构造方法
      * @param maxSize
     */
    public MyCollection(int maxSize) {
        this.maxSize = maxSize;
        arr = new Object[maxSize];
    }

    public void set(T data, int index) {
        arr[index] = data;
    }

    public T get(int index) {
        return (T)arr[index];
    }

}
