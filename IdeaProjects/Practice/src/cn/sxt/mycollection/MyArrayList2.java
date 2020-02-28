package cn.sxt.mycollection;

import java.util.Arrays;

/**
 * 增加数组扩容
 * @author NiuQun
 * @2019/11/1
 */

public class  MyArrayList2<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public  MyArrayList2() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public  MyArrayList2(int capacity) {
        if (capacity < 0) {
            throw new RuntimeException("容器容量不能为负！");
        } else if (capacity == 0) {
            this.elementData = new Object[DEFAULT_CAPACITY];
        } else {
            this.elementData = new Object[10];
        }
        this.elementData = new Object[capacity];
    }

    public void add(E element) {
        if (this.size == this.elementData.length) {
            // 注意运算符优先级, + 的优先级高于 >>
            this.elementData = Arrays.copyOf(this.elementData, this.elementData.length + (this.elementData.length >> 1));
        }
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

    public E get(int index) {
        checkRange(index);
        return (E)this.elementData[index];
    }
    public void set(E element, int index) {
        checkRange(index);
        this.elementData[index] = element;

    }

    public void checkRange(int index) {
        if (size < 0 || index > size-1) {
            throw new RuntimeException("索引不合法！");
        }
    }


    public void remove(E element) {
        for (int i = 0; i < this.elementData.length; i++) {
            if (element.equals(get(i))) {
                remove(i);
            }
        }
    }

    public void remove(int index) {
        int numMoved = this.elementData.length-index-1;
        if (numMoved > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        }

        elementData[--size] = null;
    }

    public int size() {
        return this.size ;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyArrayList2<Integer> s1 = new  MyArrayList2<Integer>(20);
        s1.add(32);
        s1.add(78);
        System.out.println(s1);
        System.out.println(s1.get(0));
        s1.set(3333, 0);
        System.out.println(s1);
        // s1.remove(0);
        s1.remove(78);
        System.out.println(s1);
        s1.remove(0);
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
    }


}
