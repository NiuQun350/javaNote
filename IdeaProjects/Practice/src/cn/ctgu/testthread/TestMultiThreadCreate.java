package cn.ctgu.testthread;

/**
 * 创建多线程程序的第二种方式： 实现Runnable接口
 *  java.lang.Runnable
 *  Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现. 类必须定义一个成为run的方法
 *  java.lang.Thread类的构造方法
 *  Thread(Runnable target) 分配新的Thread对象
 *  Thread(Runnable target, String name) 分配新的Thread对象
 *
 *  实现步骤：
 *  1.创建一个Runnable接口的实现类
 *  2.在实现类中重写Runnable类的run()方法，并在run()方法中设置线程任务
 *  3.创建一个Runnable接口的实现类对象
 *  4.创建Thread类对象, 构造方法中传递Runnable接口的实现类对象
 *  5.调用Thread类中的start()方法，开启新的线程执行run()方法
 *
 *  设计该接口的目的是为希望在活动时执行代码的对象提供一个公共协议，例如， Thread类实现了Runnable, 激活的意思是说某个线程已启动，并且尚未停止
 *  此外，Runnable为非Thread子类的类提供了一种激活方式，通过实例化某个Thread实例并将自身作为运行目标，就可以运行实现Runnable的类而无须创建Thread的子类
 *  大多数情况下，如果只想写run() 方法，而不重写其他Thread方法，那么应使用Runnable接口，这很重要，因为除非程序员打算修改或增强类的基本行为，否则不应该为该类创建子类
 *
 * 实现Runnable接口创建多线程程序的好处：
 *   1.避免了单继承的局限性，实现了Runnable还可以继承其他的类和实现其他的接口
 *   2.增强了程序的扩展性，降低了程序的耦合性（解耦）：
 *      实现Runnable接口的方式，把设置线程任务和开启新线程进行了分离（解耦）
 *      实现类中，重写了run方法，用来设置线程任务
 *      创建Thread类对象，调用start方法，用来开启新线程
 *      -
 * @author NiuQun
 * @2019/12/31
 */

public class TestMultiThreadCreate {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }

        RunnableImp runnableImp = new RunnableImp();
        Thread thread = new Thread(runnableImp);
        thread.start();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        });
        thread1.start();
    }
}

class RunnableImp implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}