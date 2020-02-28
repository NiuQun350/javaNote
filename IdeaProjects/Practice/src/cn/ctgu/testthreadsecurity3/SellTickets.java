package cn.ctgu.testthreadsecurity3;

/**
 * 模拟卖票案例
 * 创建3个线程，同时开启，对共享的票进行出售
 *
 * 解决线程安全问题的第二种方法：使用同步方法(这里将同步方法设定为静态方法)
 *    使用步骤：
 *          1.把访问了共享数据的代码抽取出来，放到一个方法中
 *          2.在方法上添加synchronized修饰符
 *
 *  格式：定义方法的格式
 *       修饰符  synchronized  返回值类型  方法名(参数列表) {
 *           可能会出现线程安全问题的代码（访问了共享数据的代码）
 *       }
 *
 *   同步方法也会把方法内部的代码锁住
 *   只让一个线程执行时，静态同步方法的锁对象不是this，因为this是创建对象之后产生的，静态方法优先于对象
 *   静态方法的锁对象是本类的class属性--->class文件对象(反射)
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
    private static int ticket = 100;

    /**
     * 创建一个锁对象
     */
    Object object = new Object();

    /**
     * 设置线程任务： 卖票
     */

    public static synchronized void sellTicket() {
        // 先判断票是否存在
        if (ticket > 0) {
            // 票存在, 卖票
            System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票");
            ticket--;
        }
    }

    @Override
    public void run() {
        // 每个线程执行的起点都是它上次执行的终点
        // 每个线程最初的运行起点都是相同的, 即run()方法的第一行代码
        // 每个线程都执行了一次run()方法, 只不过这里, run() 方法中操作的数据是公共拥有的
        while (true) {
            sellTicket();
        }
    }
}