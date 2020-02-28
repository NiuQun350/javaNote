package cn.ctgu.testthread;

/**
 * 用匿名内部类方式创建线程
 * @author NiuQun
 * @2019/12/31
 */

public class TestThreadCreatAnonymous {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "--->" + i);
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "---->" + i);
                }

            }
        }).start();
    }

}
