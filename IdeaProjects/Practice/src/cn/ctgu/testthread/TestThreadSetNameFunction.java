package cn.ctgu.testthread;

/**
 * 设置线程的名称：
 *   1.使用Thread类中的方法setName()
 *      void setName(String name) 方法用于改变线程名称，使之与参数name相同
 *   2.创建一个带参数的构造方法，参数传递线程的名称；调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread）给子线程一个名字
 *
 *
 * @author NiuQun
 * @2019/12/31
 */

public class TestThreadSetNameFunction {
    public static void main(String[] args) {
        MyTestThread myTestThread = new MyTestThread();
        myTestThread.start();
        myTestThread.setName("测试Thread");

        MyTestThread myTestThread1 = new MyTestThread("Hello World");
        myTestThread1.start();

    }
}

class MyTestThread extends Thread {
    public MyTestThread() {}

    public MyTestThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
