package cn.niuqun.circlequeue;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author NiuQun
 * @2019/9/14
 */

public class ArrayCircleQueueDemo {
    public static void main(String[] args) {
        ArrayCircleQueue circleQueue = new ArrayCircleQueue(4);
        char choice;  // choice用于接收用户输入选择
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("s(save):存入数据");
            System.out.println("d(delete):删除数据");
            System.out.println("l(list):显示队列中所有数据");
            System.out.println("g(get):显示队列中第一个数据");
            System.out.println("e(exit):退出程序\n");
            System.out.println("请输入选项:\n");

            choice = scanner.next().charAt(0);
            switch (choice) {
                case 's':
                    System.out.println("请输入需要保存的整数:");
                    int data = scanner.nextInt();
                    circleQueue.saveArrayQueue(data);
                    break;
                case 'd':
                    System.out.printf("已删除的数据为:%d\n", circleQueue.deleteArrayQueue());
                    break;
                case 'l':
                case 'g':
                case 'e':
                default:
                    System.out.println("输入有误，请重新输入!");
                    break;
            }
        }

    }
}

/**
 * 建立循环队列类
 */
class ArrayCircleQueue {
    /**
     * front指向队列的第一个元素
     */
    private int front;
    /**
     * rear指向队列最后一个元素的后一个位置
     */
    private int rear;
    /**
     * arrMaxSize为循环队列的数组长度, 长度为arrMaxSize，但是实际上可存储数据年为arrMaxSize-1
     */
    private int arrMaxSize;
    /**
     * arr为循环队列的数组
     */
    private int[] arr;

    /**
     * 构造方法
     * @param arrMaxSize
     */
    public ArrayCircleQueue(int arrMaxSize) {
        this.arrMaxSize = arrMaxSize;
        front = 0;
        rear = 0;
        arr = new int[arrMaxSize];
    }

    /**
     * 判断队列是否已满
     * @return
     */
    public boolean isFull() {
        return (rear + 1) % arrMaxSize == front;
    }

    /**
     * 判断队列是否为空
     * @return
     */
    public boolean isEmpty() {
        return rear == front;
    }


    /**
     *向队列中存入数据
     * @param data
     */
    public void saveArrayQueue(int data) {
        if(isFull()) {
            System.out.println("队列已满,无法再存入数据");
            return;
        }
        arr[rear] = data;
        rear = (rear + 1) % arrMaxSize;
        return;
    }

    /**
     * 从队列中删除数据
     * @return
     */
    public int deleteArrayQueue() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空，无法再取出数据");
        }
        int result = arr[front];
        arr[front] = 0;
        front = (front + 1) % arrMaxSize;
        return result;
    }

    /**
     * 显示队列中的所有数据
     */
    public void listArrayQueue() {
        if(isEmpty()) {
            System.out.println("队列为空");
        }
        for(int i = front; i < front + validDataSize(); i++) {
            int index = i % arrMaxSize;
            System.out.printf("a[%d]=%d\n", index, arr[index]);
        }
    }

    /**
     * 计算循环队列中有效数据个数
     * @return
     */
    public int validDataSize() {
        return (rear - front + arrMaxSize) % arrMaxSize;
    }

    /**
     * 打印队列首元素
     * @return
     */
    public int getHeadArrayQueue() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return arr[front];
    }
}
