package cn.ctgu.testswing;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import javax.swing.*;
import java.awt.*;

/**
 * @author NiuQun
 * @2019/12/23
 */

public class TestJPanel {
    public static void main(String[] args) {
        new MyJPanel();
    }
}

class MyJPanel extends JFrame {
    public MyJPanel() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(100, 100, 600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        // 容器设置布局
        // 后面两个参数的意思是：上下间距,左右间距,由于container中添加的是面板,因此这实际上指的是面板与面板之间的间距
        container.setLayout(new GridLayout(2, 1, 10, 10));
        // 面板设置布局
        JPanel jPanel1 = new JPanel(new GridLayout(1, 3));
        JPanel jPanel2 = new JPanel(new GridLayout(2, 2));
        JPanel jPanel3 = new JPanel(new GridLayout(3, 3));

        jPanel1.add(new JButton("1"));
        jPanel1.add(new JButton("2"));
        jPanel1.add(new JButton("3"));

        jPanel2.add(new JButton("4"));
        jPanel2.add(new JButton("5"));
        jPanel2.add(new JButton("6"));

        jPanel3.add(new JButton("7"));
        jPanel3.add(new JButton("8"));
        jPanel3.add(new JButton("9"));
        jPanel3.add(new JButton("10"));
        container.add(jPanel1);
        container.add(jPanel2);
        container.add(jPanel3);
    }
}
