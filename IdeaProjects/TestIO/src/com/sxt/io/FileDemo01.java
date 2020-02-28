package com.sxt.io;

import java.io.File;

/** File状态：
 *  1.不存在： 通过exits() 判断
 *  2.存在； 文件：isFile() 文件夹：isDirectory()
 *  3.
 *
 * @author NiuQun
 * @2019/10/12
 */

public class FileDemo01 {
    public static void main(String[] args) {
        String path = "/home/NiuQun/workstation/IdeaProjects/TestIO/src/plane.jpg";

        // 1.构建File对象方式1      绝对地址
        // 创建的可以是文件也可以是文件夹
        File src = new File(path);
        System.out.println(src.length());

        // 2.构建File对象方式2      父名称 + 子名称
        src = new File("/home/NiuQun/workstation/IdeaProjects/TestIO/src", "plane.jpg");
        // 实际上只要拼的出来就行
        System.out.println(src.length());
        src = new File("/home/NiuQun/workstation/IdeaProjects/","TestIO/src/plane.jpg");
        // length只能返回文件的大小，如果是文件夹则返回0
        // 但是返回为0可能是因为是文件夹， 也可能是文件不存在，
        // 那么此时就要用isFile()判断是否为文件， 用isDirectory判断是否为文件夹， 用exits()来判断File对象是否存在
        System.out.println(src.length());

        // 3.构建File对象方式3      父对象 + 子名称
        src = new File(new File("/home/NiuQun/workstation/IdeaProjects/TestIO/src"), "plane.jpg");

        // getParent()返回的是父路径，如果构建的时候给的是相对路径，就返回null，如果按照方式1，2，3创建，就返回相应的父路径(即所有的上路径)
        System.out.println("$$$$$$$$$$$$$");
        System.out.println("getParent:" + src.getParent());
        System.out.println(src);

        // getParentFile() 返回父对象，即上一层
        System.out.println(src.getParentFile().getName());
        System.out.println("***************");

        src = new File("plane.jpg");

        System.out.println(src.getParent());

        // 得到绝对路径 实际上就是 src.getProperty + src.getPath
        System.out.println(src.getAbsolutePath());

        // 打印人工指定的路径，
        // 即：如果构建的时候使用的是相对路径，那么返回的就是相对路径，如果构建的时候使用的是绝对路径，那么返回的就是绝对路径，
        System.out.println(src.getPath());

        // 打印当前目录
        System.out.println(System.getProperty("user.dir"));



        if (null == src || !src.exists()) {
            System.out.println("文件不存在！");
        } else {
            if (src.isFile()) {
                System.out.println("文件操作：");
            } else {
                System.out.println("文件夹操作：");
            }
        }



    }
}
