package cn.ctgu.guiprogram;
import java.awt.*;


/**
 * util(utility)
 * GUI(Graphical User Interface, 图形用户界面)简介:
 * GUI核心:Swing, AWT(Abstract Window ToolKit,抽象窗口工具包), GUI不流行是因为界面不美观，并且需要jre环境,但是它是MVC架构的基础 AWT是Swing的前身
 *
 * AWT介绍:
 * 1.包含了很多类和接口
 * 2.元素：窗口，按钮，文本框
 * 3.java.awt
 * 4.Component(组件): button, TextArea(文本域), Label......         Container(容器): Window --->  Frame, Dialog  Panel(面板) ---> Applet
 *
 * 5.Component(抽象类)  -->Container(非抽象类)  -->Window(非抽象类)  -->Frame(非抽象类)
 * @author NiuQun
 * @2019/12/15
 */

/**
 * GUI的第一个界面
 * @author NiuQun
 */
public class SingleWindow {
    public static void main(String[] args) {
        Frame frame = new Frame("这是我的第一个Java图形界面窗口！");
        // 设置可见性,默认是不可见的,即默认是true
        frame.setVisible(true);
        // 设置窗口大小
        frame.setSize(400, 400);
        // 设置背景颜色
        Color color = new Color(255, 46, 208);
        frame.setBackground(color);
        // 设置弹出的初始位置
        frame.setLocation(200, 200);
        // 窗口初始化后默认是可以任意拉伸尺寸的,在这里我们可以设置大小固定,即默认是true,设置为false后,窗口不可以任意拉伸并且不能够最大化
        frame.setResizable(false);


    }

}
