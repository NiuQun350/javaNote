package cn.sxt.game;

import org.omg.CORBA.IMP_LIMIT;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * AWT和Swing时Java中常见的GUI(图形用户界面)技术，但是Java很少用于桌面开发
 * @author NiuQun
 * @2019/10/11s
 */

public class MyGameFrame extends JFrame{
    /**
     * 属性
     */
    Image background = GameUtil.getImage("images/background.jpeg");
    Image ball = GameUtil.getImage("images/ball.jpeg");
    Image plane = GameUtil.getImage("images/plane.jpeg");

    /**
     * paint方法会自动被调用，不需要手动调用
     * @param g 相当于一直画笔
     */
    @Override
    public void paint(Graphics g) {
        g.drawImage(background, 200, 200, null);
        g.drawImage(ball, 300, 300, null);

    }

    /**
     * 初始化窗口
     */
    public void launchFrame() {
        setTitle("尚学堂学员_程序员作品");
        // 窗口默认是不可见的，我们传入true让它可见
        setVisible(true);
        // setLocation(0, 0);
        setSize(1024, 576);

        // WindowAdapter是一个接口，本来是不可以直接new的，
        // 但是由于只需要使用一次，故可以采用匿名内部类的方法，使该类默认实现了WindowAdapter, 在后边花括号里直接实现接口中的抽象方法
        // 方法addWindowListener参数为接口
        // 这里调用了addWindoeListener方法，
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // 0表示正常结束，负数表示异常结束
                System.exit(0);
            }
        });


    }

    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }

}
