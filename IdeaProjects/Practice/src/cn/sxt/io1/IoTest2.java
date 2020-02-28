package cn.sxt.io1;
import java.io.File;
/**
 * @author NiuQun
 * @2019/10/27
 */

public class IoTest2 {
    public static void main(String[] args) {
        DirCount dirCount = new DirCount("/home/NiuQun/workstation");
        System.out.println(dirCount.getDirLength());

    }
}

class DirCount {
    private long dirLength = 0;
    private String path;
    private File file;
    public DirCount(String path) {
        this.path = path;
        this.file = new File(path);
        count(this.file);
    }


    public long getDirLength() {
        return dirLength;
    }

    private void count(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                this.dirLength += file.length();
            } else {
                for (File file1:file.listFiles()) {
                    count(file1);
                }
            }

        }


    }



}