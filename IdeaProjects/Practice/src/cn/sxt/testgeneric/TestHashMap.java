package cn.sxt.testgeneric;

import java.util.HashMap;

/**
 * 哈希表的基本结构就是"数组+链表", 哈希表结合了数组和链表两者的优点
 * HashMap存储时是没有顺序的，即输入顺序不一定等于输出顺序
 * TreeMap存储时默认按照值(key)由小到大的顺序或者ASCII码顺序保存，并且按照这个顺序输出， 即输出顺序也不等于输出顺序，但是输出顺序一定是已经排列好的
 * @author NiuQun
 * @2019/11/1
 */

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String > hm = new HashMap<Integer, String>(16);
        // 跟16取余
        // 余7
        hm.put(23, "aaa");
        // 余15
        hm.put(15, "ccc");
        // 余3
        hm.put(3, "ddd");
        // 余2
        hm.put(34, "eee");
        System.out.println(hm);
        for (Integer key: hm.keySet()) {
            System.out.println(key + "----" + hm.get(key));
        }
    }
}
