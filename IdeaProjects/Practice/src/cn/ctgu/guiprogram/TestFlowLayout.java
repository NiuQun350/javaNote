package cn.ctgu.guiprogram;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 容器可设置布局管理器，管理容器中组件的布局：
 *
 * container.setLayout(new XxxLayout());
 *
 *
 *
 * Java有6种布局管理器，AWT提供了5种：
 *
 * FlowLayout
 * BorderLayout
 * GridLayout
 * GridBagLayout
 * CardLayout
 *
 * Swing还提供了一种：
 * BoxLayout
 *
 * @author NiuQun
 * @2019/12/19
 */


/**
 * 流式布局
 * 1、FlowLayout     流式布局
 *
 * 顾名思义，组件像水流一样，从第一行开始，从左向右依次排列，碰到边界时转到下一行继续。
 *
 * 三个构造函数：
 *
 * FlowLayout()     //使用默认参数
 * FlowLayout(int align)   //设置对齐方式
 * FlowLayout(int align,int hgap,int vgap)   //设置对齐方式、水平间距、垂直间距
 * align是FlowLayout类的常量，比如：FlowLayout.LEFT，FlowLayout.CENTER
 *
 *
 * @author NiuQun
 */
public class TestFlowLayout {
    public static void main(String[] args) {
        // 设置窗口
        Frame frame = new Frame("测试流式布局");
        frame.setVisible(true);
        frame.setBounds(100, 100, 500, 500);
        frame.setBackground(new Color(43, 88, 191));
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        // 组件-按钮
        Button button1 = new Button("按钮1");
        Button button2 = new Button("按钮2");
        Button button3 = new Button("按钮3");
        Button button4 = new Button("按钮4");
        Button button5 = new Button("按钮5");


        // 设置为流式布局, 默认为CENTER
        // 如果不设置setLayout()的话,会默认置顶
        // 如果不设置frame的布局,则在frame中添加panel后会占据整个窗口
        frame.setLayout(new FlowLayout());
        // frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // 设置布局
        Panel panel = new Panel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.setBounds(100, 100, 200, 200);
        // cyan:青绿色
        panel.setBackground(Color.cyan);
        // 在窗口中添加布局
        frame.add(panel);

        // 把按钮组件添加到panel中
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);


    }
}
