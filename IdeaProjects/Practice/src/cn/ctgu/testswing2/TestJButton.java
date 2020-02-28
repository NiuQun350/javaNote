package cn.ctgu.testswing2;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author NiuQun
 * @2019/12/23
 */

public class TestJButton {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends JFrame {
    public MyFrame() {


        Container container = this.getContentPane();
        // 将一个图片变为图标
        URL url = MyFrame.class.getResource("Picture.png");
        Icon imageIcon = new ImageIcon(url);

        // 把这个图标放在按钮上
        JButton jButton = new JButton();
        jButton.setIcon(imageIcon);
        jButton.setToolTipText("图片按钮");
        container.add(jButton);


        this.setVisible(true);
        this.setBounds(100, 100, 600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}