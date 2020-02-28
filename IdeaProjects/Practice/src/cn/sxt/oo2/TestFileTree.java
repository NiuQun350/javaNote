package cn.sxt.oo2;

import java.io.File;
/**
 * 使用递归算法打印目录树
 */
public class TestFileTree {
    public static void main(String[] args) {
        File f = new File("/home/NiuQun/workstation");
        printFile(f, 0);
    }

    static void printFile(File file, int level) {
        for(int i = 0; i < level; i++) {
            System.out.printf("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()) {
            File[] files = file.listFiles();  // 返回file下的所有子目录和子文件
            for(File temp:files) {
                printFile(temp, level+1);
            }

        }
    }
}
