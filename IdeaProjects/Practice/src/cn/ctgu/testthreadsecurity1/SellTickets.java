package cn.ctgu.testthreadsecurity1;

/**
 * 模拟卖票案例
 * 创建3个线程，同时开启，对共享的票进行出售
 *
 * 解决线程安全问题的第一种方法：使用同步代码块
 * 格式：
 *      synchronized(锁对象) {
 *          可能会出现线程安全问题的代码（访问了共享数据的代码）
 *      }
 *      注意：
 *          1.通过代码块中的锁对象，可以使用任意的对象
 *          2.但是必须保证多个线程使用的锁对象是同一个
 *          3.锁对象的所用：
 *              把同步代码块锁住，只让一个线程在同步代码块中执行
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

    /**
     * 创建一个锁对象
     * 实际上，锁对象只要是唯一存在的对象就可以，甚至可以是this 或者是 RunnableImpl.class 或者是Runnable.class
     */
    Object object = new Object();

    /**
     * 设置线程任务： 卖票
     */
    @Override
    public void run() {
        // 每个线程执行的起点都是它上次执行的终点
        // 每个线程最初的运行起点都是相同的, 即run()方法的第一行代码
        // 每个线程都执行了一次run()方法, 只不过这里, run() 方法中操作的数据是公共拥有的
        while (true) {
            synchronized (object) {
                // 先判断票是否存在
                if (ticket > 0) {
                    // 提高安全问题出现的概率, 让程序睡眠一下,这里是为了用于程序测试, 说明问题
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 即使不加睡眠机制, 每个线程同样有几率在这里失去运行权限, 使该线程暂时停在这里,等待获得权限
                    // 票存在, 卖票
                    System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票");
                    ticket--;
                } else {
                    System.out.println("票已售罄！");
                    break;
                }
            }
        }
    }
}