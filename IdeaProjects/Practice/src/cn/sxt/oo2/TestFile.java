package cn.sxt.oo2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) throws IOException {
        /*
        File f = new File("/home/NiuQun/workstation-1/practice/test.txt");  // 指定一个文件
        f.createNewFile();  // 创建文件， 要记得抛出异常
        System.out.println("打印文件路径：" + f);  // 打印文件的路径
        System.out.println(f.getName());     // 打印文件相对路径
        System.out.println(f.getAbsolutePath());  // 打印文件绝对路径
        f.renameTo(new File("/home/NiuQun/workstation-1/practice/b.txt"));  // 为文件改名

        System.out.println(System.getProperty("user.dir")); // 打印当前项目的路径

        File f1 = new File("gg.txt"); // 如果不写路径，则默认将其创建在当前项目下
        f1.createNewFile();
        System.out.println(f1.getName());     // 打印文件名字
        System.out.println("$$$$$$$$");
        System.out.println("File是否存在：" + f1.exists());
        System.out.println("File是否是目录:" + f1.isDirectory());
        System.out.println("File是否是文件：" + f1.isFile());
        System.out.println("File的大小：" + f1.length());
        System.out.println("File的最后修改时间:" + new Date(f1.lastModified()));
        System.out.println("显示当前时间：" + new Date());
        System.out.println("File的相对路径:" + f1.getPath());
        System.out.println("File的绝对路径" + f1.getAbsolutePath());
        System.out.println(f1); */

        /*
        System.out.println("***********");
        File f2 = new File("dd");
        f2.createNewFile();
        System.out.println("File是否存在：" + f2.exists());

        System.out.println("File是否是目录:" + f2.isDirectory());
        System.out.println("File是否是文件:" + f2.isFile());

        f2.delete();
        System.out.println("File是否存在：" + f2.exists());
        System.out.println("********"); */
        File f3 = new File("myDirectory");
        f3.mkdir();
        System.out.println("File是否是文件：" + f3.isFile());
        System.out.println("File是否是目录：" + f3.isDirectory());

    }
}
