package cn.ctgu.guiprogram1;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 测试鼠标监听事件
 * @author NiuQun
 * @2019/12/22
 */

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画图");
    }
}

class MyFrame extends Frame {
    /**
     * 画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
     */

    private ArrayList points;

    public MyFrame(String title) {
        super(title);
        setBounds(200, 200, 400, 300);
        // 存鼠标点击的点
        points = new ArrayList<>();
        // 鼠标监听器是针对这个窗口的
        this.addMouseListener(new MyMouseListener());
        // 窗口监听器
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);

    }

    @Override
    public void paint(Graphics g) {
        // 画画需要监听鼠标的事件
        // 用迭代器将其中的点迭代出来
        Iterator iterator = points.iterator();
        // 如果iterator中还有点,我们就将它画下来
        while (iterator.hasNext()) {
            Point point = (Point)iterator.next();
            g.setColor(Color.BLUE);
            // 画的点实际上是一个圆形, 只不过这个圆的半径比较小罢了
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    /**
     * 添加一个点到界面上
     */
    public void addPoint(Point point) {
        points.add(point);

    }



    /**
     * 当监听器监听到待监听对象发生相应的动作时，
     *  适配器类实现了接口
     */
    private class MyMouseListener extends MouseAdapter {
        // 鼠标动作：按下, 弹起, 按住不放
        @Override
        public void mousePressed(MouseEvent e) {
            // e代表当前的鼠标,e.getSource所在鼠标所在的窗口对象
            MyFrame myFrame = (MyFrame)e.getSource();
            // 这里我们点击的时候就会在界面上产生一个点！
            // 这个点就是鼠标的点
            myFrame.addPoint(new Point(e.getX(), e.getY()));
            // 每次点击鼠标都需要重新画一遍,即刷新,即再次执行paint()方法
            myFrame.repaint();
        }
    }

}
