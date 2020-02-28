package cn.ctgu.exceptionpractice;

/**
 * @author NiuQun
 * @2019/11/8
 */

public class TestException3 {
    public static void main(String[] args) throws Exception{
        Person person1 = new Person(-34);
    }

}

class Person {
    private int age;

    public Person(int age) throws IllegalAgeException{
        super();
        if (age < 0) {
            throw new IllegalAgeException("the age is illegal");
        }

        this.age = age;
    }


    class IllegalAgeException extends Exception {

        public IllegalAgeException() {

        }

        public IllegalAgeException(String message) {
            super(message);
        }

    }
}