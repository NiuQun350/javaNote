package cn.ctgu.testthread;

/**
 * 主线程:即执行Main方法的线程
 * 单线程程序:java程序中只有一个线程， 执行从Main方法开始，从上到下依次执行
 * 多线程之间执行的顺序是随机的，但是在执行的过程中，单独对于每一个线程而言，它的内部执行顺序是从上到下依次执行
 * @author NiuQun
 * @2019/12/27
 */

public class TestSingleThread {
    public static void main(String[] args) {
        // 这里只是单线程程序
        Person person1 = new Person("小钱");
        person1.test();
        /// 但是这里有一个缺陷,只要程序运行过程中有中断,那么后续的程序就都不能够再继续运行了,这就是单线程的弊端
        /// 如果采用多线程就不会产生这个弊端,即使一个线程异常中断,其他的线程依旧能够正常运行
        new MyThread().start();
        // 因为在main线程中 “System.out.println(0/0);”语句一定在 “Person person2 = new Person("小王") person2.test();” 语句之前执行
        // 执行了"System.out.println(0/0);" 语句后, 会抛出异常, 使main线程结束, 因此"Person person2 = new Person("小王")  person2.test();"语句一定不会执行时
        System.out.println(0/0);

        Person person2 = new Person("小王");
        person2.test();



    }
}


class Person {
    private String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}