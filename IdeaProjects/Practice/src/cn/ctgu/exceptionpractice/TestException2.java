package cn.ctgu.exceptionpractice;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author NiuQun
 * @2019/11/8
 */

public class TestException2 {
    public static void main(String[] args) throws IOException{
        readMyFile();
    }

    public static void readMyFile() throws IOException {
        FileReader reader = null;
        reader = new FileReader("/home/NiuQun/workstation/myTest/test1");
        char c1 = (char)reader.read();
        System.out.println(c1);

        if (reader != null) {
            reader.close();
        }
    }


}
