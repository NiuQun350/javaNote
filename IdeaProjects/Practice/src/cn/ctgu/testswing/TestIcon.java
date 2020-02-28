package cn.ctgu.testswing;

import sun.awt.X11.XIconWindow;

import javax.swing.*;
import java.awt.*;

/**
 * Icon(图标是一个接口)，我们需要实现它，
 * @author NiuQun
 * @2019/12/23
 */

public class TestIcon {
    public static void main(String[] args) {
        new MyIcon().init();
    }

}

class MyIcon extends JFrame implements Icon {
    private int iconWidth;
    private int iconHeight;

    public MyIcon() throws HeadlessException {}

    public MyIcon(int iconWidth, int iconHeight) throws HeadlessException {
        this.iconWidth = iconWidth;
        this.iconHeight = iconHeight;

    }

    public void init() {
        MyIcon myIcon = new MyIcon(15, 15);
        // 图标可以放在标签上,也可以放在按钮上
        JLabel jLabel = new JLabel("IconTest", myIcon, SwingConstants.CENTER);
        Container container = this.getContentPane();
        container.add(jLabel);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x, y, iconWidth, iconHeight);
    }

    @Override
    public int getIconWidth() {
        return iconWidth;
    }

    @Override
    public int getIconHeight() {
        return iconWidth;
    }
}