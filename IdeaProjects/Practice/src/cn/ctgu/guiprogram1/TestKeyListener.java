package cn.ctgu.guiprogram1;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author NiuQun
 * @2019/12/22
 */

public class TestKeyListener {
    public static void main(String[] args) {
        new KeyFrame("键盘监听");
    }
}

class KeyFrame extends Frame {

    public KeyFrame(String title) {
        super(title);
        this.setVisible(true);
        this.setBounds(100, 100, 600, 400);
        this.addKeyListener(new KeyAdapter() {
            // 键盘按下
            @Override
            public void keyPressed(KeyEvent e) {
                // 获得键盘按下的键是哪一个
                // 获取当前键盘的码
                int keyCode = e.getKeyCode();
                System.out.println(e.getKeyCode());
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("上键");
                }
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
