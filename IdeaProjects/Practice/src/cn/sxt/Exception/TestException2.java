package cn.sxt.Exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestException2 {
    public static void main(String[] args) throws IOException{
        readMyFile();
        /* try {
            readMyFile();
        } catch(IOException e) {
            e.printStackTrace();
        } */
    }

    public static void readMyFile() throws FileNotFoundException, IOException {
        FileReader reader = new FileReader("/home/NiuQun/workstation-1/practice/c.txt");
        char ch = (char)reader.read();
        if(reader != null) {
            reader.close();
        }
    }
}


