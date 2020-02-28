package cn.sxt.game1;


import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello World", 200, 200);
    }

    /**
     * 初始化窗口
     */
    public void launchFrame() {
        setVisible(true);
        setLocation(100, 100);
        setSize(500, 500);
        setTitle("this is my first game");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }




}
