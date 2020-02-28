package cn.sxt.oo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java对异常进行了分类，不同类型的异常分别用不同的java类表示，
 * 所有的异常的根类为java.lang.Throwable;          java.lang.Object  --->  java.lang.Throwable  ---> java.lang.Error(java.lang.Exception)
 * Throwable下面又派生了两个子类:Error（表示系统JVM已经处于不可恢复的崩溃状态,大多数错误与代码编写者执行的操作无关）和Exception
 * error举例：java虚拟机运行错误(VirtualMachineError), JVM不再有继续执行操作所需的内存资源时(OutOfMemoryError),
 * 发生error时, JVM一般会选择线程终止
 *
 *             =====>   Error        ====>    Unchecked Exception
 *                                   VirtualMachineError(Java虚拟机运行错误),
 *                                   OutOfMemoryError(JVM不再有继续执行操作所需的内存空间)
 * Throwable
 *
 *                                   ====>    Runtime Exception(运行时异常,编译时不会报错,一般是逻辑错误)
 *
 *             =====>   Exception   NullPointerException(空指针异常:增加非空判断),
 *                                  ClassCastException(在引用数据类型转换时，可能发生类型转换异常：用instanceof()增加判断)
 *                                  如："Hello World" instanceof String  注意类名不用括号括起来，且必须是引用数据类型
 *                                  ArrayIndexOutOfBoundsException(数组索引越界异常：用length增加判断)
 *                                  NumberFormatException(数字格式化异常:用正则表达式判断是否为数字)
 *                                  ArithmeticException(算术异常)
 *
 *                                  ====>    Checked Exception(已检查异常,在编译器编译时就会报错)
 *                                  IOException, SQLException等用户自定义的Exception异常
 *                                  处理方式有两种：一.使用try/catch捕获异常，二使用throws声明异常
 *
 */

public class TestException {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("/home/NiuQun/workstation-1/practice/b.txt");
            try {
                char c1 = (char)reader.read();
                System.out.println(c1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
