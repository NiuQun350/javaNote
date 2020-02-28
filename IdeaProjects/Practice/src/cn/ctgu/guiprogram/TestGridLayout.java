package cn.ctgu.guiprogram;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * @author NiuQun
 * @2019/12/19
 */

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("测试表格布局");
        frame.setVisible(true);
        frame.setBounds(100, 100, 500, 500);
        frame.setBackground(new Color(18, 18, 18));
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new GridLayout(5, 2));

        Panel panel = new Panel();
        panel.setVisible(true);
        panel.setBounds(100, 100, 100, 100);
        panel.setBackground(Color.GREEN);
        panel.setLayout(new GridLayout(4, 2));
        frame.add(panel);
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);


    }
}
