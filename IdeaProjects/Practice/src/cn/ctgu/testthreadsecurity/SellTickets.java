package cn.ctgu.testthreadsecurity;

/**
 * 模拟卖票案例
 * 创建3个线程，同时开启，对共享的票进行出售
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
     * 设置线程任务： 卖票
     */
    @Override
    public void run() {
        while (true) {
            // 先判断票是否存在
            if (ticket > 0) {
                // 提高安全问题出现的概率, 让程序睡眠一下,这里时为了用于程序测试
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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