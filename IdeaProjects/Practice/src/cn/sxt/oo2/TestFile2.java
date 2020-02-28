package cn.sxt.oo2;

import java.io.IOException;
import java.io.File;

public class TestFile2 {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/NiuQun/Workstation-1/myTest1");
        boolean flag = file.exists();

        if(flag) {
            boolean flagd = file.delete();
            if(flagd) {
                System.out.println("删除成功！");
            } else {
                System.out.println("删除失败！");
            }
        } else {
            boolean flagn = true;
            try {
                File dir = file.getParentFile();
                dir.mkdirs();
                flagn = file.createNewFile();
                System.out.println("创建成功！");
            } catch (IOException e) {
                System.out.println("创建失败！");
                e.printStackTrace();
            }
        }


    }

}
