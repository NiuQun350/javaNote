package cn.ctgu.title2;

/**
 * @author NiuQun
 * @2019/11/8
 */

public class Student {
    private String number;

    public Student(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                '}';
    }
}


class NumberLengthIsLessThanSixException extends Exception {
    public NumberLengthIsLessThanSixException() {
        super();
    }
    public NumberLengthIsLessThanSixException(String message) {

    }

    @Override
    public void printStackTrace() {
        System.out.println("The length of the number is less than six");
    }
}

class NumberLengthIsMoreThanSixException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("The length of the number is more than six");
    }
}

class NonNumericCharactersInNumberException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("There are non-Numeric Characters in the number");
    }
}
