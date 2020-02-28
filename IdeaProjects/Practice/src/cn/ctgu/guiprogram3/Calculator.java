package cn.ctgu.guiprogram3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author NiuQun
 * @2019/12/21
 */

public class Calculator extends Frame {
    private TextField addend1 = new TextField(10);
    private TextField addend2 = new TextField(10);
    private TextField sum = new TextField(20);
    private Label plus = new Label("+");
    private Button equal = new Button("=");

    public TextField getSum() {
        return sum;
    }

    public Button getEqual() {
        return equal;
    }

    public TextField getAddend2() {
        return addend2;
    }

    public TextField getAddend1() {
        return addend1;
    }

    public void loadFrame() {

        this.setVisible(true);
        this.setLayout(new FlowLayout());
        this.add(addend1);
        this.add(plus);
        this.add(addend2);
        this.add(equal);
        this.add(sum);
        equal.addActionListener(new CalculatorListener());
        pack();
        windowClose(this);
    }

    public void windowClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private class CalculatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int temp1 = Integer.parseInt(getAddend1().getText());
            int temp2 = Integer.parseInt(getAddend2().getText());
            getSum().setText("" + (temp1 + temp2));
            getAddend1().setText("");
            getAddend2().setText("");
        }
    }

}