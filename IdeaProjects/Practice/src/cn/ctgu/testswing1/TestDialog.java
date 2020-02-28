package cn.ctgu.testswing1;

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
    public MainFrame(){init();}

    public MainFrame(String title){ super(title); init();}

    public void init() {
        this.setVisible(true);
        this.setBounds(100, 100, 600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(null);
        JButton button = new JButton("点击弹出一个对话框");
        button.setBounds(150, 150, 200, 200);
        container.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog();
            }
        });

    }


}

class MyDialog extends JDialog {
    public MyDialog() {
        this.setTitle("弹窗");
        this.setVisible(true);
        this.setBounds(150, 150, 600, 400);
        // 弹窗中默认就有下边这句话，因此不用再写
        // this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();container.setLayout(null);
        container.add(new JLabel("Java"));
    }

}