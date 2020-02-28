package cn.ctgu.guiprogram;

import java.awt.*;

/**
 * @author NiuQun
 * @2019/12/15
 */

public class MultipleWindows {
    public static void main(String[] args) {
        // 展示多个窗口
        MyFrame mf0 = new MyFrame(100, 100, 200, 200, Color.BLUE);
        MyFrame mf1 = new MyFrame(300, 100, 200, 200, Color.BLACK);
        MyFrame mf2 = new MyFrame(100, 300, 200, 200, Color.RED);
        MyFrame mf3 = new MyFrame(300, 300, 200, 200, Color.cyan);

    }
}

class MyFrame extends Frame {
    /**
     * 可能存在多个窗口,因此我们需要一个计数器
     */
    static int id = 0;

    public MyFrame(int x, int y, int width, int height, Color color) {
        super("MyFrame" + (++id));
        setBounds(x, y, width, height);
        setVisible(true);
        setBackground(color);
        setResizable(false);
    }

}