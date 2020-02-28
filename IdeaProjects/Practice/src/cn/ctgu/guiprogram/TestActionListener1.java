package cn.ctgu.guiprogram;

import javax.xml.ws.Action;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 两个按钮实现同一监听
 * @author NiuQun
 * @2019/12/19
 */

public class TestActionListener1 {
    public static void main(String[] args) {
        Frame frame = new Frame("开始--停止");
        frame.setVisible(true);
        frame.setBounds(100, 100, 500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setBackground(Color.darkGray);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Button buttonStart = new Button("start");
        Button buttonStop = new Button("stop");
        // 可以显示的定义触发后返回的命令,如果不定义，则默认值为button的标签名
        // 可以多个按钮只写一个监听器（监听类）
        buttonStart.setActionCommand("开始");
        buttonStop.setActionCommand("停止");
        MyMonitor myMonitor = new MyMonitor();
        buttonStart.addActionListener(myMonitor);
        buttonStop.addActionListener(myMonitor);


        frame.add(buttonStart);
        frame.add(buttonStop);
    }
}

class MyMonitor implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}