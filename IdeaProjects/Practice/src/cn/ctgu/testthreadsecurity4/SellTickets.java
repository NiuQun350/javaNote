package cn.ctgu.testthreadsecurity4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 模拟卖票案例
 *  创建3个线程，同时开启，对共享的票进行出售
 *
 *  解决线程安全问题的第三种方法：Lock锁
 *  java.util.concurrent.locks.Lock接口
 *  Lock实现提供了比使用synchronized方法和语句可获得的更广泛的锁定操作
 *
 *  Lock接口中的方法：
 *  void lock() :获取锁
 *  void unlock() : 释放锁
 *
 *  java.util.concurrent.locks.ReentrantLock implements Lock接口
 *
 *  使用步骤：
 *        1.在成员位置创建一个ReentrantLock对象
 *        2.在可能会出现安全问题的代码前调用Lock接口中的方法lock()获取锁
 *        3.在可能会出现安全问题的代码后调用Lock接口中的方法unlock()释放锁
 *
 *  一种典型的写法如下：
 *  class X {
 *      private final ReentrantLock lock = new ReentrantLock();
 *      // ...
 *
 *      public void run() {
 *          lock.lock();
 *          try {
 *              // ...method body
 *          } catch {  //当没有异常时catch 语句块可以省略
 *
 *          } finally {
 *              lock.unlock();
 *          }
 *      }
 *  }
 *
 *  上述写法的好处是，无论程序是否出现异常，都会把锁对象释放掉，这样可以提高程序的效率
 * @author NiuQun
 * @2019/12/31
 */

public class SellTickets {
    public static void main(String[] args) {
        Runnable runnable = new RunnableImp();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}


class RunnableImp implements Runnable {
    /**
     * 定义一个多线程共享的票源
     */
    private int ticket = 100;
    private final Lock lock = new ReentrantLock();
    /**
     * 设置线程任务： 卖票
     */
    @Override
    public void run() {
        while (true) {
            lock.lock();
            // 先判断票是否存在
            if (ticket > 0) {
                // 票存在, 卖票
                System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票");
                ticket--;
            }
            lock.unlock();
        }
    }
}