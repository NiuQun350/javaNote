package cn.ctgu.testswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author NiuQun
 * @2019/12/22
 */

public class TestDialog {
    public static void main(String[] args) {
        new MainFrame();
    }
}

class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        this.setVisible(true);
        this.setBounds(100, 100, 600, 500);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // JFrame 放东西需要一个容器
        Container container = this.getContentPane();
        // 绝对布局
        container.setLayout(null);
        // 按钮
        JButton button = new JButton("点击弹出一个对话框");
        button.setBounds(105, 105,20,20);
        // 点击这个按钮的时候弹出一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // 窗体
                new MyDialog();
            }
        });
        container.add(button);

    }

    public void init() {

    }

}

class MyDialog extends JDialog {
    public MyDialog() {
        this.setVisible(true);
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(new JLabel("弹窗"));
    }
}