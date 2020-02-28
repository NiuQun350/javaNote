package cn.ctgu.guiprogram1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author NiuQun
 * @2019/12/22
 */

public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame {
    public WindowFrame() {
        setVisible(true);
        setBounds(100, 100, 600, 500);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("window opened!");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("window closed");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                WindowFrame frame = (WindowFrame)e.getSource();
                frame.setTitle("被激活了！");
            }
                          }
        );
    }
}