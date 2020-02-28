package cn.ctgu.guiprogram;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author NiuQun
 * @2019/12/19
 */

public class TestText {
    public static void main(String[] args) {
        // 启动！
        new MyFrame1();
    }
}

class MyFrame1 extends Frame {
    public MyFrame1() {
        // TextArea写多行文本,  TextField写单行文本
        TextField textField = new TextField();
        add(textField);
        // 监听这个文本框输入的文字
        MyActionListener1 myActionListener1 = new MyActionListener1();
        // 按下Enter就会触发这个输入框的事件
        textField.addActionListener(myActionListener1);

        textField.setEchoChar('*');
        setVisible(true);
        pack();
        setBounds(100, 100, 500, 500);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyActionListener1 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获得一些资源,返回了一个对象
        TextField field = (TextField) e.getSource();
        // 获得输入框中的文本
        System.out.println(field.getText());
    }
}