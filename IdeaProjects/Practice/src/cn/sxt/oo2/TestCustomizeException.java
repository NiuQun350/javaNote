package cn.sxt.oo2;

/**
 * 当在程序遇到JDK提供的任何标准异常类都无法充分描述清楚我们想要表达的问题，这种情况下可以创建自己的异常类，即自定义异常类
 * 自定义异常类只需要从Exception类或者它的子类派生一个子类即可
 * 自定义异常类如果继承Exception类，则为受检查异常，必须对其进行处理；如果不想处理，可以让自定义异常类继承运行时异常RuntimeException类
 * 习惯上，自定义异常类应该包括两个构造器：一个是默认的构造器，另一个是带有详细信息的构造器
 */
public class TestCustomizeException {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-1);
    }

}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalException("年龄不能为负数");
        }
        this.age = age;
    }
}


class IllegalException extends RuntimeException {
    public IllegalException() {

    }
    public IllegalException(String msg) {
        super(msg);
    }
}
