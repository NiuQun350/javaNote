package cn.ctgu.guiprogram2;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
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
     * points中实际上存的是一系列点的地址
     */
    ArrayList<Point> points = new ArrayList<Point>();

    @Override
    public void paint(Graphics g) {
        Iterator<Point> iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = iterator.next();
            g.fillOval(point.x, point.y, 10, 10);
        }
    }

    public MyFrame(String title) {
        super(title);
        this.setVisible(true);
        this.setBounds(100, 100, 500, 400);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = new Point(e.getX(), e.getY());
                // 通过ge[tSource()方法得到鼠标所在的窗口对象
                MyFrame myFrame = (MyFrame)e.getSource();
                myFrame.addPoint(point);
                repaint();
            }
        });

    }

    public void addPoint(Point point) {
        points.add(point);
    }
}