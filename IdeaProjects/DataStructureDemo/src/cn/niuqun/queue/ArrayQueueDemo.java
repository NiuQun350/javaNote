package cn.niuqun.queue;

import java.io.IOException;

/**
 * @author NiuQun
 * @2019/9/14
 */

public class ArrayQueueDemo {
    public static void main(String[] args) {
    }



}

class ArrayQueue {
    private int arrMaxSize;
    private int front;
    private int rear;
    private int[] arrQueue;

    public ArrayQueue(int arrMaxSize) {
        this.arrMaxSize = arrMaxSize;
        front = -1;
        rear = -1;
        arrQueue = new int[arrMaxSize];
    }

    public boolean isEmpty() {
        return front == rear;
    }
    public boolean isFull() {
        return rear == arrMaxSize - 1;
    }

    /**
     * 进队列
     * @param data
     */
    public void saveQueue(int data) {
        if(isFull()) {
            System.out.println("队列已满，无法再存入数据");
            return;
        }
        rear++;
        arrQueue[rear] = data;
    }

    /**
     * 出队列
     * @return
     */
    public int deleteQueue() {
        if(isEmpty()) {
            throw new RuntimeException("队列为空，无法取出数据");
        }
        front++;
        return arrQueue[front];
    }

    /**
     * 显示队列中所有数据
     */
    public void listQueue() {
        if(isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arrMaxSize; i++) {
            System.out.printf("arr[%d]=%d\t", i, arrQueue[i]);
        }
    }

    /**
     * 打印队列头数据
     */
    public int getHeadQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空");
        }
        return arrQueue[front+1];
    }
}

