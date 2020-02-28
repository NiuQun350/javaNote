package cn.sxt.oo2;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
    public static void main(String[] args) throws IOException {
        // 指定一个文件
        File file = new File("/home/NiuQun/Workstation-1/Practice/myFile");


        // 判断该文件是否存在
        boolean flag = file.exists();
        // 如果存在就删除，如果不存在就创建
        if(flag) {
            // 删除
            boolean flagd = file.delete();
            if (flagd) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            boolean flagn = true;
            try {
                // 如果目录不存在,先创建目录
                File dir = file.getParentFile();
                dir.mkdirs();
                flagn = file.createNewFile();
                System.out.println("创建成功");
            } catch(IOException e) {
                System.out.println("创建失败");
                e.printStackTrace();
            }

        }

    }
}
