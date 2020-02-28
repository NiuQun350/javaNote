package cn.sxt.oo2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Throwable --> Exception --> IOException --> FileNotFoundException
 */
public class TestFile3 {
    public static void main(String[] args) {
        FileReader  reader = null;
        try {
            reader = new FileReader("/home/NiuQun/workstation-1/practice/b.txt");
            char c1 = (char)reader.read();
            System.out.println(c1);
        } catch(FileNotFoundException e) {        // 子类异常必须在父类前面
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
