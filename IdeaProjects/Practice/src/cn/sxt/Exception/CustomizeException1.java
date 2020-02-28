package cn.sxt.Exception;

import java.io.IOException;

public class CustomizeException1 {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.setAge(-23);

    }

}

class Person2 {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            try {
                throw new IllegalAgeException1("年龄不能为负数");
            } catch (IllegalAgeException1 e) {
                e.printStackTrace();
            }

        }
        this.age = age;

    }
}

class IllegalAgeException1 extends Exception {
    public IllegalAgeException1() {
    }

    public IllegalAgeException1(String msg) {
        super(msg);
    }

}