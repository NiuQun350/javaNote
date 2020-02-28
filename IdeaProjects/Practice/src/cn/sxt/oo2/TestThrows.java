package cn.sxt.oo2;

import java.io.FileReader;
import java.io.IOException;

/**
 * 当checkedException产生时，不一定立刻处理它，可以再把异常throws出去
 * 在方法中使用try-catch-finally，是由这个方法来处理异常，
 * 但是在一些情况下，当前方法并不需要处理发生的异常，而是向上传递给调用他的方法处理
 * 如果一个方法中可能出现某种异常，但是并不能确定如何处理这种异常，则应根据异常规范在方法的首部声明该方法可能抛出的异常
 * 如果一个方法抛出多个已检查异常，就必须在方法的首部列出所有的异常，之间以逗号隔开
 */
public class TestThrows {
    public static void main(String[] args) throws IOException {
        readMyFile();
    }

    public static void readMyFile() throws IOException {
        FileReader reader = null;
        reader =  new FileReader("/home/NiuQun/workstation-1/practice/b.txt");
        System.out.println((char)reader.read());
        if(reader != null) {
            reader.close();
        }


    }
}
