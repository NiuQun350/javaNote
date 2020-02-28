package cn.sxt.testgeneric;

import java.lang.reflect.Array;
import java.util.*;

/**
 * public interface Collection<E> extends Iterable<E> {
 *     int size();
 *
 *     boolean isEmpty();
 *
 *     boolean contains(Object var1);
 *
 *     Iterator<E> iterator();
 *
 *     Object[] toArray();
 *
 *     <T> T[] toArray(T[] var1);
 *
 *     boolean add(E var1);
 *
 *     boolean remove(Object var1);
 *
 *     boolean containsAll(Collection<?> var1);
 *
 *     boolean addAll(Collection<? extends E> var1);
 *
 *     boolean removeAll(Collection<?> var1);
 *
 *     boolean retainAll(Collection<?> var1);
 *
 *     void clear();
 *
 *     boolean equals(Object var1);
 *
 *     int hashCode();
 *
 * @author NiuQun
 * @2019/10/31
 */

public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("this is s string");
        c.add("this is an another string");
        c.add("test");
        // remove 只是移除容器c中存储参数对象的地址（容器c中存储的是地址）,移除之后该对象依旧在存储空间中
        c.remove("test");
        System.out.println(c);
        c.clear();
        System.out.println(c);
        System.out.println(Arrays.toString(c.toArray()));

        Collection<Integer> c1 = new ArrayList<Integer>();
        c1.add(11);
        c1.add(22);
        c1.add(33);
        c1.add(44);

        Collection<Integer> c2 = new ArrayList<Integer>();
        c2.add(22);
        c2.add(33);
        c2.add(44);
        c2.add(55);

        // c1中是否包含c2中的所有元素
        System.out.println(c1.containsAll(c2));

        // 把c2中的元素全部添加到c1中去
        c1.addAll(c2);
        System.out.println(c1);

        // 移除c1中与c2中相同的元素, 保留不相同的元素
        c1.removeAll(c2);
        System.out.println("******");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("******");

        c1.add(22);
        c1.add(33);
        c1.add(44);
        // 移除c1中和c2不相同的元素, 保留相同的元素
        c1.retainAll(c2);
        System.out.println(c1);


        Collection<Double> c3 = new ArrayList<Double>();
        List<Double> c4 = new ArrayList<Double>();
        ArrayList<Double> c5 = new ArrayList<>();




    }
}