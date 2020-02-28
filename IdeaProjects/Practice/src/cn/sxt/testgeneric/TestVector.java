package cn.sxt.testgeneric;

import java.util.LinkedList;
import java.util.Vector;

/**
 * List接口常用的实现类有3个:ArrayList,  LinkedList, Vector
 * ArrayList底层是用数组实现的顺序存储，特点:查询效率高，增删效率低，线程不安全，但是我们一般使用它
 * LinkedList底层是用节点实现的链式存储 特点:查询效率低，增删效率高，线程不安全
 * Vector底层是用数组实现的List, 相关的方法都加了同步检查, 因此"线程安全，效率低", 比如:indexOf() 方法就增加了synchronized同步标记
 *
 * public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
 *
 * public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
 *
 * public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
 *
 * @author NiuQun
 * @2019/11/1
 */

public class TestVector {
    public static void main(String[] args) {

    }
}
