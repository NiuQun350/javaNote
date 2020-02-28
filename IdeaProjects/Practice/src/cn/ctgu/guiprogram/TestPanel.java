package cn.ctgu.guiprogram;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Panel可以看成是一个空间，但是不能单独存在
 * @author NiuQun
 * @2019/12/19
 */

public class TestPanel {
    public static void main(String[] args) {
        // 实例化一个窗口
        Frame frame = new Frame("用于测试面板！");
        // 实例化一个布局
        Panel panel = new Panel();
        // setLayout()方法用于设置布局,如果不设置,会默认置顶
        frame.setLayout(null);

        frame.setBounds(300, 300, 500, 500);
        frame.setBackground(new Color(207, 66, 70));

        // panel设置坐标,相对于frame
        panel.setBounds(50, 50, 400, 400);
        panel.setBackground(new Color(82, 178, 103));

        // frame.add(panel) 将面板添加到窗口中
        frame.add(panel);
        frame.setVisible(true);
        // 窗口只有一个,但是面板可以有多个,因此内容应该放在面板中,而不是放在窗口当中
        // 监听事件,监听窗口关闭事件 System.exit(0)
        frame.addWindowListener(new WindowAdapter() {
            // 窗口点击关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                // 结束程序 System.exit(1)是异常退出
                System.exit(0);
            }
        });


    }
}