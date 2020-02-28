package cn.ctgu.testswing1;

import javax.swing.*;
import java.awt.*;

/**
 * @author NiuQun
 * @2019/12/23
 */

public class TestIcon {
    public static void main(String[] args) {
        new MyIcon().init();
    }
}

class MyIcon extends JFrame  implements Icon {
    private int iconWidth;
    private int iconHeight;

    public MyIcon() throws HeadlessException {}

    public MyIcon(int iconWidth, int iconHeight) throws HeadlessException {
        this.iconWidth = iconWidth;
        this.iconHeight = iconHeight;
    }

    public void init() {
        this.setVisible(true);
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyIcon myIcon = new MyIcon(15, 15);
        JLabel jLabel = new JLabel("icon", myIcon, SwingConstants.CENTER);
        Container container = this.getContentPane();
        container.add(jLabel);
        container.setBackground(Color.RED);


    }

    /**
     * 画一个图标
     * @param component
     * @param g
     * @param x
     * @param y
     */
    @Override
    public void paintIcon(Component component, Graphics g, int x, int y) {
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
