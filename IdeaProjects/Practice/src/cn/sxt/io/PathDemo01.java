package cn.sxt.io;

import java.io.File;
import java.io.IOException;

/**
 * @author NiuQun
 * @2019/10/26
 */

public class PathDemo01 {
    /**
     * separatorChar是字符,separator是字符串，它们的值是一样的。
     * 查阅jdk的源码:
     * public static final String separator = "" + separatorChar;
     * 其实separator是由separatorChar转换成的，所以只是类型不同
     *
     * File类下的常量 pathSeparator(路径分隔符)
     * 路径分隔符:  :(Linux) ;(Windows)
     * separator（名称分隔符）
     *
     * 名称分割符:  /(Linux) \(Windows) separator 或者 separatorChar
     *
     *
     * 具体使用中都可以达到访问路径的效果，只不过有一点小区别
     * 正斜杠的话，一般在配置文件路径时，指向下一个路径只要使用一个
     * 例如："c:/a/1.txt";
     * 而反斜杠的话，在配置文件路径时，由于它本身在java中有特殊意义，作为转义符而存在，所以具体意义上的反斜杠要两个
     * 例如："c\\a\\1.txt";这里的第一个反斜杠是作为转义符存在的，第二个才是真正意义上的反斜杠
     * 一般可以认为是"/"的作用等同于"\\"
     * 在java中路径一般用"/"
     * windows中的路径一般用"\"
     * linux、unix中的路径一般用"/"
     * 最好用“/”  因为java是跨平台的。“\”（在java代码里应该是\\）是windows环境下的路径分隔符，Linux和Unix下都是用“/”。而在windows下也能识别“/”。所以最好用“/”
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String path1 = "/home/NiuQun/workstation/IdeaProjects/Practice/src/cn/sxt/io/picture.png";
        String path2 = "/home/NiuQun/workstation/note/javaNote";
        System.out.println(File.separator);
        System.out.println(File.separatorChar);

        // 路径建议写法: 1. /
        String path3 = "/home/NiuQun/workstation";
        // 路径建议写法: 2. 常量拼接
        //  String path4 = File.separatorChar + "home" + File.separatorChar + "NiuQun" + File.separatorChar + "workstation";
        String path5 = File.separator + "home" + File.separator + "NiuQun" + File.separator + "workstation";

        System.out.println(path3);
        System.out.println(path5);
        System.out.println("*************");

        File file = new File(path1);
        System.out.println(path1);
        System.out.println(file);

        // 打印文件的长度
        System.out.println(file.length());
        System.out.println((new File(path3)).length());
        //
        System.out.println(System.getProperty("user.dir"));

        System.out.println(file.getName());
        System.out.println("******************************");

        File file6 = new File("/home/NiuQun/workstation/note/javaNote/io.txt");
        // 创建新文件时要抛出异常,因为可能创建失败
        // createNewFile()使用的前提条件是要创建的文件不存在,如果已经存在，则返回false
        boolean flag = file6.createNewFile();
        System.out.println(flag);
        file6.delete();


        // 注意：文件名不能是com,con等操作系统的设备名


    }
}
