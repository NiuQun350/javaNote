package cn.ctgu.testswing2;

import cn.ctgu.discrete.collection.Main;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author NiuQun
 * @2019/12/23
 */

public class TestJButton1 {
    public static void main(String[] args) {

    }
}

class MainFrame extends JFrame {
    public MainFrame() {
        Container container = this.getContentPane();
        URL url = MainFrame.class.getResource("Picture.png");
        ImageIcon imageIcon = new ImageIcon(url);








        this.setVisible(true);
        this.setBounds(100, 100, 600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}