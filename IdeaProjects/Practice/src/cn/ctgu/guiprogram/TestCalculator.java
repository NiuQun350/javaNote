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

/**
 * 简易计算器
 */
public class TestCalculator {
    public static void main(String[] args) {
        new Calculator();
    }
}

/**
 * 计算器类
 */
class Calculator extends Frame {
    public Calculator(){
        // 3个文本框,传入的参数为能够输入的最大字符数
        TextField num1 = new TextField(10);
        TextField num2 = new TextField(10);
        TextField num3 = new TextField(20);

        // 1个按钮
        Button button = new Button("=");
        button.addActionListener(new MyCalculatorListener(num1, num2, num3));
        // 1个标签
        Label label = new Label("+");

        // 布局
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);
        setVisible(true);
        windowClose(this);
        pack();

    }

    public void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

/**
 * 监听器类
 */
class MyCalculatorListener implements ActionListener {
    /**
     * 获取三个变量
     */

    private TextField num1;
    private TextField num2;
    private TextField num3;

    public MyCalculatorListener(TextField num1, TextField num2, TextField num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 1.获得加数和被加数
        int addend1 = Integer.parseInt(num1.getText());
        int addend2 = Integer.valueOf(num2.getText());
        // 2.将加数和被加数经过加法运算后, 放到第三个框
        num3.setText(("" + (addend1 + addend2)));
        // 3.清除前两个框
        num1.setText("");
        num2.setText("");
    }
}