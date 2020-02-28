package cn.sxt.generic3;

/**
 * @author NiuQun
 * @2019/12/13
 */

public class TestGeneric1 {
    public static void main(String[] args) {
        MyCollection1<String> myCollection1 = new MyCollection1<>();
    }
}

class MyCollection1<T> {
    Object[] objects = new Object[5];

    public void set(T t, int index) {
        objects[index] = t;
    }
    public T get(int index) {
        return (T)objects[index];
    }
}
