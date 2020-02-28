package cn.sxt.io;

import java.io.File;

/**
 * @author NiuQun
 * @2019/10/26
 */

public class TestMkdir1 {
    public static void main(String[] args) {
        File file = new File("/home/NiuQun/workstation");
        printName(file, 0);

    }

    /**
     * 打印子孙级目录和文件名称
     */
    public static void printName(File tempFile, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.printf("-");
        }
        System.out.println(tempFile.getName());

        // 递归出口
        if (null == tempFile || !tempFile.exists()) {
            return;
        } else if (tempFile.isDirectory()) {
            for (File s:tempFile.listFiles()) {
                printName(s, deep+1);
            }
        }
    }


}
