package cn.sxt.testgeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;


/**
 * 注意System.arrayCopy() 和 Arrays.copyOf() 两个用于拷贝数组的方法的不同之处
 * ArrayList底层是用数组实现的存储，特点：查询效率高，增删效率低，线程不安全. 我们一般使用它
 * size实际上保存的是元素中已经存储的元素的个数，不是容器的大小
 *
 * @author NiuQun
 * @2019/10/31
 */

public class TestList1 {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<Integer>();
        c1.add(11);
        c1.add(22);
        c1.add(33);
        c1.add(44);


        c1.remove(2);
        System.out.println(c1);
        System.out.println("*********");

        List list = new ArrayList<Integer>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(2, 55);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf(0));
        System.out.println(list);
        System.out.println(list.indexOf(44));
        System.out.println(list.lastIndexOf(33));

        ArrayList<Integer> test1 = new ArrayList<>();
        System.out.println(test1.size());
        test1.add(5);
        System.out.println(test1.size());
        System.out.println("*******");
        ArrayList<Integer> test2 = new ArrayList<>(5);
        for (int i = 0; i < 6; i++) {
            test2.add(i);
        }

        System.out.println(test2.size());
        test2.get(3);

        System.out.println("-----------------");
        System.out.println();
        ArrayList<Integer> ls = new ArrayList<>(5);
        ls.add(1);
        ls.toString();
        // ls.add(2, 10000);  会抛出索引异常
        // System.out.println(ls);


    }
}
