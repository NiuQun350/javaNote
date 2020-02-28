package cn.ctgu.guiprogram;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Frame:框架
 * 设置为BorderLayout布局时不需要frame.setLayout(new BorderLayout());
 * 但是设置为FlowLayout时需要frame.setLayout(new FlowLayout());
 * @author NiuQun
 * @2019/12/19
 */

public class TestBorderLayout {
    public static void main(String[] args) {
        // 设置窗口
        Frame frame = new Frame("测试边界布局");
        frame.setVisible(true);
        frame.setBackground(Color.GREEN);
        frame.setBounds(100, 100, 500, 500);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // 如果不设置frame的布局,则在frame中添加panel后会占据整个窗口
        frame.setLayout(new FlowLayout());

        // 设置面板
        Panel panel = new Panel();
        panel.setBackground(new Color(185, 207, 81));
        panel.setBounds(100, 100, 300, 300);
        panel.setLayout(new BorderLayout());
        panel.setVisible(true);
        // 将面板添加到窗口中
        frame.add(panel);

        // 设置按钮组件
        Button button1 = new Button("西-West");
        Button button2 = new Button("东-East");
        Button button3 = new Button("北-North");
        Button button4 = new Button("南-South");
        Button button5 = new Button("中-Center");
        // 在面板中添加内容
        panel.add(button1, BorderLayout.WEST);
        panel.add(button2, BorderLayout.EAST);
        panel.add(button3, BorderLayout.NORTH);
        panel.add(button4, BorderLayout.SOUTH);
        panel.add(button5, BorderLayout.CENTER);

    }

}
