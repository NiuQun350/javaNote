package cn.sxt.io1;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author NiuQun
 * @2019/10/27
 */

public class IoTest1 {
    private static long dirLength;
    public static void main(String[] args) {
        File dir = new File("/home/NiuQun/workstation");
        for (String tempStr:dir.list()) {
            System.out.println(tempStr);
        }

        for (File tempFile:dir.listFiles()) {
            System.out.println(tempFile);
        }

        // listRoots() is a static way
        for (File tempFile:File.listRoots()) {
            System.out.println(tempFile);
        }
        System.out.println("********************");
        printNames(dir, 0);

        dirLength(dir);
        System.out.println(IoTest1.dirLength);
        /*
        IoTest1.dirLength(dir);
        System.out.println(dirLength);
         */
    }



    public static void printNames(File file, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.printf("-");
        }
        System.out.println(file.getName());
        if (null == file || !file.exists()) {
            return;
        } else if (file.isDirectory()) {
            for (File file1: file.listFiles()) {
                printNames(file1, deep+1);
            }
        }
    }

    public static void dirLength(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                dirLength += file.length();
            } else {
                for (File file1: file.listFiles()) {
                    dirLength(file1);
                }
            }



        }
    }

}
