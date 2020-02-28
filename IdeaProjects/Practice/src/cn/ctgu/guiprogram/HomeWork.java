package cn.ctgu.guiprogram;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author NiuQun
 * @2019/12/19
 */

public class HomeWork {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBackground(Color.WHITE);
        frame.setBounds(100, 100, 800, 500);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(null);

        Panel panel1 = new Panel();
        panel1.setVisible(true);
        panel1.setBackground(Color.RED);
        panel1.setBounds(50, 50, 150, 100);

        Panel panel2 = new Panel();
        panel2.setVisible(true);
        panel2.setBackground(Color.ORANGE);
        panel2.setBounds(200, 50, 300, 100);
        panel2.setLayout(new GridLayout(2, 1));

        Panel panel3 = new Panel();
        panel3.setVisible(true);
        panel3.setBackground(Color.YELLOW);
        panel3.setBounds(500, 50, 150, 100);

        Panel panel4 = new Panel();
        panel4.setVisible(true);
        panel4.setBackground(Color.GREEN);
        panel4.setBounds(50, 150, 150, 100);

        Panel panel5 = new Panel();
        panel5.setVisible(true);
        panel5.setBackground(Color.BLUE);
        panel5.setBounds(200, 150, 300, 100);
        panel5.setLayout(new GridLayout(2, 1));
        Panel panel6 = new Panel();
        panel6.setVisible(true);
        panel6.setBackground(Color.RED);
        panel6.setBounds(500, 150, 150, 100);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");
        Button button8 = new Button("button8");

        panel1.add(button1);
        panel2.add(button2);
        panel2.add(button7);
        panel3.add(button3);
        panel4.add(button4);
        panel5.add(button5);
        panel5.add(button8);
        panel6.add(button6);


    }
}
