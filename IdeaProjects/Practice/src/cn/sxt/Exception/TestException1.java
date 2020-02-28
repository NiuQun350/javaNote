package cn.sxt.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
             reader = new FileReader("/home/NiuQun/workstation-1/practice/d.txt");
            char ch = (char)reader.read();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null) {
                    reader.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}