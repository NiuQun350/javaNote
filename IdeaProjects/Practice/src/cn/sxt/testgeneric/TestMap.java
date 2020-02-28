package cn.sxt.testgeneric;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap指定初始值大小
 * 指定初始值大小应为2的幂如果指定的初始值不是2的幂，则HashMap的容量为大于指定初始值的2的幂；如果不指定，容量默认为16。
 *
 * HashMap自动扩容
 * 当HashMap的键值对个数大于容量的75%时，HashMap的容量扩大一倍。
 *
 * Map就是用来存储"键(key)-值(value)对"的，Map类中存储的"键值对"通过键来标识，所以"键对象"不能重复
 * Map接口实现的类有 HashMap, TreeMap, HashTable, Properties
 * @author NiuQun
 * @2019/11/1
 */

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>(16);
        m1.put(1, "one");
        m1.put(3, "tree");
        System.out.println(m1.get(1));
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());

        System.out.println(m1.containsKey(1));
        System.out.println(m1.containsValue("tree"));

        System.out.println("***********");

        Map<Integer, String> m2 = new HashMap<>(16);
        m2.put(4, "four");
        m2.put(5, "five");

        m1.putAll(m2);
        System.out.println(m1);
        m1.put(3, "三");
        // 键是不能重复的, 如果重复(利用键类的equals()方法来判断键是否重复), 则新的覆盖旧的
        System.out.println(m1);








    }
}
