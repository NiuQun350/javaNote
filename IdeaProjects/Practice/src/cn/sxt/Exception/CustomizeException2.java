package cn.sxt.Exception;

import java.io.IOException;

public class CustomizeException2 {
    public static void main(String[] args) /* throws IllegalAgeException2 */{
        Person3 person3 = new Person3();
        try {
            person3.setAge(-23);
        } catch (IllegalAgeException2 e) {
            e.printStackTrace();
        }
    }

}

class Person3{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAgeException2 {
        if(age < 0) {
            throw new IllegalAgeException2("年龄不能为负数");
        }
        this.age = age;

    }
}

class IllegalAgeException2 extends Exception {
    public IllegalAgeException2() {
    }

    public IllegalAgeException2(String msg) {
        super(msg);
    }

}