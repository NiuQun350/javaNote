package cn.ctgu.testthread;

/**
 * 获取线程的名称：
 *   1.使用Thread类中的方法getName()
 *        String getName()返回该线程的名称
 *   2.可以先获取到当前正在执行的线程( static Thread currentThread() 返回当前正在执行的线程对象的引用)，然后使用线程中的方法getName()获取线程的名称
 *
 *
 *   线程的调度:
 *       1.调整线程优先级：Java线程有优先级，优先级高的线程会获得较多的运行机会。
 *       Java线程的优先级用整数表示，取值范围是1~10，Thread类有以下三个静态常量：
 *            static int MAX_PRIORITY 线程可以具有的最高优先级，取值为10。
 *            static int MIN_PRIORITY 线程可以具有的最低优先级，取值为1。
 *            static int NORM_PRIORITY 分配给线程的默认优先级，取值为5。
 *            Thread类的setPriority()和getPriority()方法分别用来设置和获取线程的优先级。
 *            每个线程都有默认的优先级. 主线程的默认优先级为Thread.NORM_PRIORITY。
 *            线程的优先级有继承关系，比如A线程中创建了B线程，那么B将和A具有相同的优先级。
 *            JVM提供了10个线程优先级，但与常见的操作系统都不能很好的映射。
 *            如果希望程序能移植到各个操作系统中，
 *            应该仅仅使用Thread类有以下三个静态常量作为优先级，这样能保证同样的优先级采用了同样的调度方式。
 *       2.线程睡眠:Thread.sleep(long millis)方法，使线程转到阻塞状态。
 *            millis参数设定睡眠的时间， 以毫秒为单位。
 *            当睡眠结束后，就转为就绪（Runnable）状态。
 *            sleep()平台移植性好。
 *       3、线程等待：Object类中的wait()方法，导致当前的线程等待，直到其他线程调用此对象的 notify() 方法 或 notifyAll() 唤醒方法。
 *          这个两个唤醒方法也是Object类中的方法，行为等价于调用 wait(0) 一样。
 *       4、线程让步：Thread.yield() 方法，暂停当前正在执行的线程对象，把执行机会让给相同或者更高优先级的线程。
 *       5、线程加入：join()方法，等待其他线程终止。
 *          在当前线程中调用另一个线程的join()方法，则当前线程转入 阻塞状态，直到另一个进程运行结束，当前线程再由阻塞转为就绪状态。
 *       6、线程唤醒：Object类中的notify()方法，唤醒在此对象监视器上等待的单个线程。
 *          如果所有线程都在此 对象上等待，则会选择唤醒其中一个线程.选择是任意性的，并在对实现做出决定时发生.
 *          注意：Thread中suspend()和resume()两个方法在JDK1.5中已经废除，不再介绍.因为有死锁倾向.
 * @author NiuQun
 * @2019/12/31
 */

public class TestThreadGetNameFunction {
    public static void main(String[] args) {

        // Main主线程和我们自己开创的子线程是同级的, 线程的执行是随机的,因此每次的输出结果可能是不同的（这里我们可以尝试多运行即此看看）
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        System.out.println("\n&&&&&&");
        Thread thread = MyThread.currentThread();
        System.out.println(thread);
        System.out.println(thread.getName());
        System.out.println("&&&&&&&\n");

        MyThread1 myThread12 = new MyThread1();
        myThread12.start();

        MyThread1 myThread13 = new MyThread1();
        myThread13.start();

        MyThread2 myThread21 = new MyThread2();
        myThread21.start();

        System.out.println("********");
        MyThread1 myThread14 = new MyThread1();
        myThread14.start();
        System.out.println("*********");

        MyThread2 myThread22 = new MyThread2();
        myThread22.start();





    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        // 获取线程的名称
        System.out.println(getName());
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        // 获取该线程
        System.out.println(Thread.currentThread().getName());
        // 获取当前正在执行的线程
        System.out.println(Thread.currentThread());
    }
}