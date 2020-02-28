package com.sxt.io;

import java.io.File;

/**
 * @author NiuQun
 * @2019/10/12
 */

public class PathDemo01 {
    public static void main(String[] args) {
        String path = "/home/NiuQun/workstation/IdeaProjects/TestIO/src/plane.jpg";
        System.out.println(path);
        // 名称分隔符
        System.out.println(File.separatorChar);
        System.out.println(File.separator);
    }


}
