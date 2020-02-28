package cn.ctgu.testthread;

/**
 * @author NiuQun
 * @2019/12/31
 */

public class TestThreadSleepFunction {
    public static void main(String[] args) {
        for (int i = 1; i <= 60; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000, 0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
