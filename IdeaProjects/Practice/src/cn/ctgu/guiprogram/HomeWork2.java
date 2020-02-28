package cn.ctgu.guiprogram;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author NiuQun
 * @2019/12/19
 */

public class HomeWork2 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBackground(Color.WHITE);
        frame.setBounds(100, 100, 500, 500);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setLayout(new GridLayout(2, 1));

        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2, 1));

        panel1.add(new Button("button1"), BorderLayout.WEST);
        panel1.add(new Button("button2"), BorderLayout.EAST);

        panel2.add(new Button("button3"));
        panel2.add(new Button("button4"));
        panel1.add(panel2, BorderLayout.CENTER);

        Panel panel3 = new Panel(new BorderLayout());
        panel3.add(new Button("button5"), BorderLayout.WEST);
        panel3.add(new Button("button6"), BorderLayout.EAST);
        Panel panel4 = new Panel(new GridLayout(2, 2));
        for (int i = 1; i < 5; i++) {
            panel4.add(new Button("button" + (i+6)));
        }
        panel3.add(panel4, BorderLayout.CENTER);
        frame.add(panel1);
        frame.add(panel3);

    }
}
