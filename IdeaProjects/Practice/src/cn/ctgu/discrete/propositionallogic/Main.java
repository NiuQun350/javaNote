package cn.ctgu.discrete.propositionallogic;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author NiuQun
 * @2019/12/15
 */

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("请输入q的值(0或1):");
            boolean p = inputInfo();
            System.out.println("请输入q的值(0或1):");
            boolean q = inputInfo();

            BasicCalculation bc = new BasicCalculation(p, q);
            System.out.println("p合取q=" + bc.Conjunctions());
            System.out.println("p析取q=" + bc.disjunction());
            System.out.println("p蕴含q=" + bc.implication());
            System.out.println("p等价q=" + bc.equivalence());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static boolean inputInfo() throws InputException {
        int temp = scanner.nextInt();
        if (temp == 1) {
            return true;
        } else if (temp == 0) {
            return false;
        } else {
            throw new InputException("输入的真值不合法！");
        }
    }
}

/**
 * 输入异常处理类
 */
class InputException extends Exception {
    private String message;

    public InputException() {}
    public InputException(String message) {
      super(message);
    }
    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }
}
class BasicCalculation {
    private boolean p;
    private boolean q;

    /**
     * constructor
     * @param p
     * @param q
     */
    public BasicCalculation(boolean p, boolean q) {
        this.p = p;
        this.q = q;
    }

    /**
     * 计算p合取q并返回运算结果
     * @return
     */
    public boolean Conjunctions() {
        return p && q;
    }

    /**
     * 计算p析取q并返回运算结果
     * @return
     */
    public boolean disjunction() {
        return p || q;
    }

    /**
     * 计算p蕴含q并返回运算结果
     * @return
     */
    public boolean implication() {
        return !p || q;
    }

    /**
     * 计算p等价q并返回运算结果
     * @return
     */
    public boolean equivalence() {
        return p == q;
    }
}