package cn.ctgu.testswing;

import javax.swing.*;
import java.awt.*;

/**
 * @author NiuQun
 * @2019/12/23
 */

public class TestJScroll {
    public static void main(String[] args) {
        new MyFrame();
    }
}


class MyFrame extends JFrame {
    public MyFrame() {


        Container container = this.getContentPane();

        // 文本域
        JTextArea  jTextArea = new JTextArea(20, 50);
        jTextArea.setText("JTextAreafgjkdjkgjdjgkdfgjkfgkfdgkldsjgkfjsgkfjgkdfjgkljsgkfjgskjfkgjfks;jgfkdjgkfdsj;gfdksjg;dksfjgd;s");

        // 面板
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        container.add(jScrollPane);
        container.add(jTextArea);

        this.setVisible(true);
        this.setBounds(100, 100, 300, 350);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}