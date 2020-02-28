package cn.ctgu.testthread;

/**
 * 创建多线程有两种方法：
 * 方法一: 将类声明为Thread的子类, 该子类应当重写Thread类的run方法,设置线程任务(即开启这个线程要做些什么)，
 *   接下来可以分配并重启该子类的实例(即创建Thread类并调用Thread类中的start方法，开启新的线程，调用start方法后默认会再其中调用run方法)，
 *
 * void start() 方法使该线程开始执行，java虚拟机调用该线程的run方法
 * 结果是两个线程并发的运行，当前线程(main线程)和另一个线程（即我们自己创建的新线程，执行其run方法）
 * 多次启动一个线程是非法的，特别是当线程已经结束执行后，不能再重新启动（即start方法一个线程只能调用一次，多次调用是非法的）
 *
 * java程序属于抢占式调度，哪个线程的优先级高，哪个线程优先执行，同一优先级，随机选择一个执行
 * java.lang.Thread
 * @author NiuQun
 * @2019/12/27
 */

public class TestMultiThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("Main:" + i);
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }
}
