package cn.ctgu.guiprogram;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author NiuQun
 * @2019/12/21
 */

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame {

    public void loadFrame() {
        setBounds(200, 200, 600, 400);
        setVisible(true);
        windowClose(this);
    }

    @Override
    public void paint(Graphics g) {
        // 画笔,需要有颜色,画笔,可以画画
        g.setColor(Color.RED);
        g.drawOval(100, 100, 100, 100);
        // 画一个实心的圆
        g.fillOval(200, 200, 100, 100);
        // 养成习惯, 画笔用完将它还原成最初的颜色
    }

    public void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}