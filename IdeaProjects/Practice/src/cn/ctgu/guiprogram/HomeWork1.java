package cn.ctgu.guiprogram;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 总结:
 * 1.Frame是一个顶级窗口
 * 2.Panel无法单独显示，必须添加到某个容器中
 * 3，布局管理器:FlowLayout, BorderLayout, GridLayout
 * 4,
 * @author NiuQun
 * @2019/12/19
 */

public class HomeWork1 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBounds(100, 100, 600, 600);
        frame.setBackground(Color.BLUE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new GridLayout(2, 1));


        Panel panel1 = new Panel();
        panel1.setLayout(new BorderLayout());
        Panel panel2 = new Panel();
        panel2.setLayout(new GridLayout(2, 1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2, 2));

        panel1.add(new Button("East-1"),BorderLayout.EAST);
        panel1.add(new Button("West-1"), BorderLayout.WEST);

        panel2.add(new Button("p2-button-1"));
        panel2.add(new Button("p2-button-2"));
        panel1.add(panel2, BorderLayout.CENTER);

        panel3.add(new Button("East-2"), BorderLayout.EAST);
        panel3.add(new Button("West-2"), BorderLayout.WEST);

        panel4.add(new Button("p4-button-1"));
        panel4.add(new Button("p4-button-2"));
        panel4.add(new Button("p4-button-3"));
        panel4.add(new Button("p4-button-4"));

        panel3.add(panel4, BorderLayout.CENTER);

        frame.add(panel1);
        frame.add(panel3);

    }
}