package cn.sxt.io;

import java.io.File;
import java.util.Arrays;

/**
 * mkdir() 和 mkdirs()的区别: mkdir必须保证它的上一级目录存在，如果不存在，则创建失败，mkdirs如果上一级目录不存在，则会直接创建
 * 如果该目录原本已经存在，则创建失败
 * list() 列出下一级名称，不是子孙级
 * @author NiuQun
 * @2019/10/26
 */

public class TestMkdir {
    public static void main(String[] args) {
        File file = new File("/home/NiuQun/workstation/note/javaNote/test");
        boolean flag = file.mkdir();
        System.out.println(flag);
        System.out.println("***********");
        // list()方法返回指定文件夹下一级所有文件的名称, 即返回值是一个字符串数组
        File file1 = new File("/home/NiuQun/workstation");
        String[] subNames = file1.list();
        for (String TempStr:subNames) {
            System.out.println(TempStr);
        }

        File file2 = new File("/home/NiuQun/workstation/myTest");
        file2.mkdirs();
        // file2.delete();
        System.out.println("**************");

        // listFiles()方法返回下一级所有文件对象，即返回值是一个File类对象数组
        File[] subFiles = file1.listFiles();
        for (File TempFile: subFiles) {
            System.out.println(TempFile);
            System.out.println(TempFile.getName());
            System.out.println(TempFile.getPath());
            // 文件夹大小不为0是因为在linux下一切皆是文件, 故文件夹也有大小
            System.out.println(TempFile.length());
            System.out.println(TempFile.isDirectory());
            System.out.println("-------------------------");

        }
    }
}
