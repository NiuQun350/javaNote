package cn.sxt.testgeneric;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap的位桶数组table，初始大小为16，实际使用时，显然大小是可变的.如果位桶数组中的元素达到(0.75*数组.length)，就重新调整数组大小变为原来2倍大小
 * 扩容很耗时，扩容的本质是定义新的更大的数组，并将旧数组内容挨个拷贝到新数组中，然后回收旧数组
 * HashMap.Node<K, V>[] table是HashMap的核心数组，其中 Node 数组源码:
 *
 *     static class Node<K, V> implements Entry<K, V> {
 *         final int hash;  // 键对象的哈希值
 *         final K key;     // 键
 *         V value;         // 值
 *         HashMap.Node<K, V> next;  // 下一个节点
 *
 *         Node(int hash, K key, V value, HashMap.Node<K, V> next) {
 *             this.hash = hash;
 *             this.key = key;
 *             this.value = value;
 *             this.next = next;
 *         }
 *
 *   显然,table数组中的每一个元素都是一个单向链表结构
 *   JDK8将链表在大于8的情况下变为红黑二叉树
 *
 * @author NiuQun
 * @2019/11/1
 */

public class TestMap1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "小明", 10000);
        Employee e2 = new Employee(1002, "李华", 20000);
        Employee e3 = new Employee(1003, "小刚", 30000);

        System.out.println("*************");
        System.out.println(e1.hashCode());
        System.out.println(Long.toHexString(e1.hashCode()));
        System.out.println(e1);
        System.out.println("*************");
        Map<Integer, Employee> map = new HashMap<>(16);

        map.put(1001, e1);
        map.put(1002, e2);
        map.put(1003, e3);
        System.out.println(map);
        System.out.println(map.get(1002));

    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        super.toString();
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}' ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}