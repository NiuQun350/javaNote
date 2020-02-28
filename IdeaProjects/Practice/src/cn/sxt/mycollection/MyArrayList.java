package cn.sxt.mycollection;

import java.util.Arrays;

/**
 * @author NiuQun
 * @2019/11/1
 */

public class MyArrayList {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.elementData = new Object[capacity];
    }

    public void add(Object obj) {
        elementData[size++] = obj;
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
        MyArrayList s1 = new MyArrayList(20);
        s1.add(32);
        s1.add(78);
        System.out.println(s1);

    }


}
