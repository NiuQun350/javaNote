package cn.ctgu.guiprogram1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 由面向过程转换成面向对象
 * 高内聚低耦合
 * 内部类是我们最应该使用的一个操作（做到了更好的包装）
 * 简易计算器
 * @author NiuQun
 * @2019/12/19
 */
public class TestCalculator {
    /**
     * 启动
     * @param args
     */
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

/**
 * 计算器类
 */
class Calculator extends Frame {
    /**
     * 属性:
     *     3个文本框,传入的参数为能够输入的最大字符数
     *     1个按钮
     *     1个标签
     */

    private TextField num1 = new TextField(10);
    private TextField num2 = new TextField(10);
    private TextField num3 = new TextField(20);
    private Button button = new Button("=");
    private Label label = new Label("+");

    public Calculator() {}

    public TextField getNum1() {return num1;}

    public TextField getNum2() {return num2;}

    public TextField getNum3() {return num3;}

    public Label getLabel() {return label;}

    public Button getButton() {return button;}

    /**
     * 方法
     */

    public void loadFrame() {
        button.addActionListener(new MyCalculatorListener(this));
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
     * 通过组合的方式获取三个变量(在一个类中组合另一个类)
     */
    Calculator calculator = new Calculator();

    public MyCalculatorListener(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 1.获得加数和被加数
        int addend1 = Integer.parseInt(calculator.getNum1().getText());
        int addend2 = Integer.valueOf(calculator.getNum2().getText());
        // 2.将加数和被加数经过加法运算后, 放到第三个框
        calculator.getNum3().setText(("" + (addend1 + addend2)));
        // 3.清除前两个框
        calculator.getNum1().setText("");
        calculator.getNum2().setText("");
    }
}