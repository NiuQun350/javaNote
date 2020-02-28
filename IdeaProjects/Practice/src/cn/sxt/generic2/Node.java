package cn.sxt.generic2;

/**
 * @author NiuQun
 * @2019/11/1
 */

/**
 * 定义一个节点
 */
public class Node {
    Node previous;
    Object element;
    Node next;

    public Node(Node previous, Node next, Object element) {
        super();
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        super();
        this.element = element;
    }
}
