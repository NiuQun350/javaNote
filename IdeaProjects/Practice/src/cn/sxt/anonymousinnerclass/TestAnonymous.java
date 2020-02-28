package cn.sxt.anonymousinnerclass;

/**
 *
 * @author NiuQun
 * @2019/11/21
 */

public class TestAnonymous {
    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void printInfo() {
                System.out.println("This is an anonymous inner class");
            }
        };
        test.printInfo();
    }
}
interface Test{
    public void printInfo();
}