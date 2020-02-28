package cn.sxt.oo4;

import javax.jws.Oneway;
import java.util.Arrays;

/**
 * 数组就是一种容器(集合)，可以在其中放置对象或基本数据类型
 *                            <<interface>>Set(无顺序，不可重复)    ==>HashSet
 * <<interface>>Collection ==>
 *                                              ==>ArrayList
 *                            <<interface>>List(有顺序, 可重复)
 *                                              ==>LinkedList
 *
 *  <<interface>>Map   ==> HashMap(用于存放键值对)
 * @author NiuQun
 * @2019/10/16
 */

public class TestContainer {
    public static void main(String[] args) {

        String[] str = new String[3];
        str[0] = "Hello";
        str[1] = "World";
        System.out.println(Arrays.toString(str));

        MyCollection mc = new MyCollection();
        mc.set("Hello", 0);
        mc.set(false, 1);
        mc.set(5, 2);
        mc.set(3.54, 3);
        for (int i = 0; i < mc.objs.length; i++) {
            System.out.println(mc.get(i));
        }


    }
}

class MyCollection {
    Object[] objs = new Object[5];

    public void set(Object object, int index) {
        objs[index] = object;
    }

    public Object get(int index) {
        return objs[index];
    }
}