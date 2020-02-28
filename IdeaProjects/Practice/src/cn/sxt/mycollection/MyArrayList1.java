package cn.sxt.mycollection;

/**
 * 增加泛型
 * @author NiuQun
 * @2019/11/1
 */

public class MyArrayList1<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList1() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList1(int capacity) {
        this.elementData = new Object[capacity];
    }

    public void add(E element) {
        elementData[size++] = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(this.elementData[i]).append(" ");
        }

        sb.setCharAt(sb.length()-1, ']');
        return sb.toString();
    }

    public static void main(String[] args) {
        MyArrayList1<Integer> s1 = new MyArrayList1<>(20);
        s1.add(32);
        s1.add(78);
        System.out.println(s1);

    }





}
