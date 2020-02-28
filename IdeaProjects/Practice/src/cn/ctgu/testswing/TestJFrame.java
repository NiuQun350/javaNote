package cn.ctgu.testswing;

import javax.swing.*;
import java.awt.*;

/**
 * @author NiuQun
 * @2019/12/22
 */

public class TestJFrame {
    public static void main(String[] args) {
        // 建立一个窗口
        new MyJFrame().init();
    }
}

class MyJFrame {
    /**
     * init(); 初始化
     */

    public void init() {
        // 顶级窗口
        JFrame frame = new JFrame("这是一个JFrame");
        frame.setVisible(true);
        frame.setBounds(100, 100, 500, 400);
        frame.setBackground(Color.BLUE);
        // 设置文字
        JLabel label = new JLabel("JLabel");
        frame.add(label);

        // Swing中不需要在写监听器,因为已经提前写好,可以直接调用相关的方法来实现该功能
        // 关闭事件
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}