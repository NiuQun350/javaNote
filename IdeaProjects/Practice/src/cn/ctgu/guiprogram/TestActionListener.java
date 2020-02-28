package cn.ctgu.guiprogram;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 事件监听：当某个事情发生的时候，干什么？
 * @author NiuQun
 * @2019/12/19
 */

public class TestActionListener {
    public static void main(String[] args) {
        // 按下按钮,触发一些事情
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBounds(100, 100, 500, 500);
        frame.setBackground(Color.darkGray);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Button button = new Button();
        button.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("EEEE");
            }
        });

        frame.add(button);
    }



}
