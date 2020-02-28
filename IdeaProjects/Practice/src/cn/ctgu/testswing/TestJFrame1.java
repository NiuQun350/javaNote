package cn.ctgu.testswing;

import javax.swing.*;
import java.awt.*;

/**
 * @author NiuQun
 * @2019/12/22
 */

public class TestJFrame1 {
    public static void main(String[] args) {
        new MyJFrame1().init();
    }
}

class MyJFrame1 extends JFrame {
    public void init() {
        this.setBounds(100, 100, 500, 400);
        this.setVisible(true);
        JLabel label = new JLabel("Java标签");
        this.add(label);
        // 让文本标签居中
        label.setHorizontalAlignment(SwingConstants.CENTER);
        Container container = this.getContentPane();
        container.setBackground(Color.BLUE);

    }


}