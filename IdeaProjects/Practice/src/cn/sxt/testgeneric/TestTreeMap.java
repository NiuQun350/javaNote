package cn.sxt.testgeneric;

import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

import java.util.TreeMap;

/**
 * TreeMap是红黑二叉树的典型实现, TreeMap类核心代码： private Transient Entry<K,V> root = null;
 * root用来保存整个树的根节点,
 * HashMap存储时是没有顺序的，即输入顺序不一定等于输出顺序
 * TreeMap存储时默认按照值(key)由小到大的顺序或者ASCII码顺序保存，并且按照这个顺序输出， 即输出顺序也不等于输出顺序，但是输出顺序一定是已经排列好的
 *
 * TreeMap 默认排序规则：按照key的字典顺序来排序（升序）
 * 当然，也可以自定义排序规则：要实现Comparator接口
 *
 * HashMap类和HashTable用法几乎一样,底层实现几乎一样，只不过HashTable的方法中添加了synchronized关键字确保线程同步检查，效率较低
 * HashMap:线程不安全,效率高,允许key或value为null
 * HashTable:线程安全，效率低，不允许key或者value为null
 * @author NiuQun
 * @2019/11/2
 */

public class TestTreeMap {
    public static void main(String[] args) {
        /*
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(20, "aa");
        treeMap.put(3, "bb");
        treeMap.put(6, "cc");
        System.out.println(treeMap);

        for (Integer key: treeMap.keySet()) {
            System.out.println(key + "-----" +treeMap.get(key));
        }
         */

        TreeMap<Worker, Integer> tm = new TreeMap<Worker, Integer>();
        Worker[] worker = new Worker[5];
        worker[0] = new Worker(1001, "ccc", 10000);
        worker[1] = new Worker(1003, "ccc", 6000);
        worker[2] = new Worker(1005, "ccc", 8000);
        worker[3] = new Worker(1002, "ccc", 8000);
        worker[4] = new Worker(1004, "ccc", 5000);
        for (int i = 0; i < worker.length; i++) {
            tm.put(worker[i], i);
        }

        for (Worker key: tm.keySet()) {
            System.out.println(tm.get(key));
        }


    }
}

class Worker implements Comparable<Worker> {
    int id;
    String name;
    double salary;

    public Worker(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    /**
     * @return 负数:小于   0:等于    正数:大于
     */
    public int compareTo(Worker worker) {
        if (this.salary < worker.salary) {
            return -1;
        } else if (this.salary > worker.salary) {
            return 1;
        } else {
            if (this.id < worker.id) {
                return -1;
            } else if (this.id > worker.id) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}



