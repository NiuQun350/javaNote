package cn.ctgu.guiprogram3;

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
    ArrayList<Point>  points = new ArrayList<>();


    public MyFrame() {}
    public MyFrame(String title) {
        super(title);
        setVisible(true);
        setBounds(100, 100, 500, 400);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = new Point(e.getX(), e.getY());
                MyFrame myFrame = (MyFrame)e.getSource();
                getPoints().add(point);
                repaint();
            }
        });
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    @Override
    public void paint(Graphics g) {
        Iterator<Point> iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point)iterator.next();
            g.fillOval(point.x, point.y, 10, 10);
        }
    }
}
