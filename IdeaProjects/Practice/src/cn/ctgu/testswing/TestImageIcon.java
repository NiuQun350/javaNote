package cn.ctgu.testswing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author NiuQun
 * @2019/12/23
 */

public class TestImageIcon {
    public static void main(String[] args) {
        new MyImageIcon();
    }
}

class MyImageIcon extends JFrame {
    /**
     * 有参构造器
     * @throws HeadlessException
     */
    public MyImageIcon() throws HeadlessException {


        JLabel jLabel = new JLabel("ImageIcon");
        // 图片和类在同一级目录下,因此可以通过当前类获取当前类路径下的东西
        // 即通过 类名.class 可以获得当前类的相对于该项目的路径
        URL url = MyImageIcon.class.getResource("Firefox_wallpaper.png");
        ImageIcon imageIcon = new ImageIcon(url);
        jLabel.setIcon(imageIcon);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = this.getContentPane();
        container.add(jLabel);

        this.setVisible(true);
        this.setBounds(100, 100, 600, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}