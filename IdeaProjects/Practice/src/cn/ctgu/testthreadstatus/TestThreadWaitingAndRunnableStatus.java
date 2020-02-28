package cn.ctgu.testthreadstatus;

/**
 * 线程的 WAITING（无限等待） 状态和 RUNNABLE（运行） 状态相互转换的实例
 *
 * 等待唤醒案例：线程之间的通信
 *       创建一个顾客线程（消费者）：告知老板自己要的包子的种类和数量，调用wait()方法，放弃CPU的执行，进入到WAITING状态（无限等待）
 *       创建一个老板线程（生产者）：花了5秒时间做包子，包子做好之后，调用notify()方法，唤醒顾客吃包子
 *  注意：顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个在执行
 *       同步使用的锁对象必须保证是唯一的
 *       只有锁对象才能调用wait() 和 notify() 方法
 *
 * Object类中的方法：
 *       void wait() : 在其他线程调用此对象的notify()或 notifyAll() 方法前，导致当前线程等待
 *       void notify() : 唤醒在此对象监视器上等待的单个线程， 会继续执行wait()方法之后的代码
 *
 *
 * @author NiuQun
 * @2019/12/31
 */

public class TestThreadWaitingAndRunnableStatus {
    public static void main(String[] args) {
        // 创建一个顾客线程（消费者）
        new Thread() {
            @Override
            public void run() {
                // 保证等待和唤醒的线程只能有一个执行, 需要使用同步技术
                synchronized (this) {
                    System.out.println("告知老板自己要的包子的种类和数量");
                    try {
                        // 调用wait()方法,放弃CPU的执行, 进入到WAITING状态（无限等待）
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        // 创建一个老板对象
        new Thread() {
            @Override
            public void run() {
                // 花了五秒做包子, 我们就让它睡眠5秒
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (this) {
                    System.out.println("老板五秒钟之后做好包子, 告诉顾客可以吃包子了");
                    this.notify();
                    // 唤醒之后会继续执行wait()之后的代码
                }
            }
        }.start();

    }
}
