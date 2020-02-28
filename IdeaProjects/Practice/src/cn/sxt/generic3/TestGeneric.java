package cn.sxt.generic3;

import java.util.Arrays;

/**
 * @author NiuQun
 * @2019/12/13
 */

public class TestGeneric {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        myCollection.set("dfd", 0);
        myCollection.set(3424, 2);
        myCollection.set('c', 1);
        System.out.println(myCollection);
        System.out.println(myCollection.get(0));
    }
}
class MyCollection{
    Object[] objects = new Object[5];

    public void set(Object object, int index) {
        objects[index] = object;
    }
    public Object get(int index) {
        return objects[index];
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
