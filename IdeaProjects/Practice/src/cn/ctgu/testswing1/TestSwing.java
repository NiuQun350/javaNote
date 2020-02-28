package cn.ctgu.testswing1;

import javax.swing.*;
import java.awt.*;

/**
 * @author NiuQun
 * @2019/12/22
 */

public class TestSwing {
    public static void main(String[] args) {
        new MyJFrame().init();
    }
}

class MyJFrame extends JFrame {
    public MyJFrame(String title) throws HeadlessException {
        super(title);
    }

    public MyJFrame() throws HeadlessException {}

    public void init() {
        this.setVisible(true);
        this.setBounds(100, 100, 600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Java标签");
        this.add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Container container = this.getContentPane();
        container.setBackground(Color.RED);
        container.add(label);
    }
}