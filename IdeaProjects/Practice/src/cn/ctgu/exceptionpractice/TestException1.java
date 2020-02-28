package cn.ctgu.exceptionpractice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author NiuQun
 * @2019/11/8
 */

public class TestException1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("/home/NiuQun/workstation/myTest/test");
            System.out.println("step1");
            char c1 = (char)reader.read();
            System.out.println(c1);
        } catch (FileNotFoundException e) {
            System.out.println("step2");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("step4");
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("step5");
                e.printStackTrace();
            }

        }

    }
}
