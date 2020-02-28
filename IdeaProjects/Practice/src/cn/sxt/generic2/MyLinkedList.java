package cn.sxt.generic2;



/**
 * 自定义LinkedList
 * ArrayList底层是用数组实现的存储，特点：查询效率高，增删效率低，线程不安全，但是多数的时候使用ArrayList
 * 如果需要查询效率高，则使用ArrayList, ArrayList可以存放任意数量的对象，长度不受限制，实现原理实际上就是数组的拷贝
 * 如果需要增删效率高，则使用LinkedList
 * 如果需要线程安全，则使用vector
 *
 * @author NiuQun
 * @2019/9/15
 *
 */
public class MyLinkedList {

    private Node first;
    private Node last;
    private int size;

    public void add(Object obj) {
        Node node = new Node(obj);
        if (first == null) {
            // node.previous = null;
            // node.next = null;

            first = node;
            last = node;
        } else {
            last.next = node;

            node.previous = last;
            node.next = null;

            last = node;
        }
        this.size++;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node temp = first;
        while (temp != null) {
            sb.append(temp.element + " ");
            temp = temp.next;
        }
        sb.setCharAt(sb.length()-1, ']');

        return sb.toString();
    }

    public Object get(int index) {
        if (index < 0|| index > size-1) {
            throw new RuntimeException("索引数字不合法！");
        }

        Node temp = first;
        /*
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.element;
         */

        if (index <= (size>>1)) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            for (int i = size-1; i > index; i--) {
                temp = temp.previous;
            }
        }
        return temp.element;
    }

    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add(34);
        ml.add(56);
        System.out.println(ml);
        System.out.println(ml.get(0));
    }
}

