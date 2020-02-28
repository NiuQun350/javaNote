package cn.ctgu.exceptionpractice;


import java.io.PrintStream;

/**
 * @author NiuQun
 * @2019/11/8
 */

public class TestException4 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.income(1000, -34);
            bank.income(10000, 3434);
        } catch (BankException e) {
            System.out.println(e.warnMessage());
            e.printStackTrace();

        }
    }
}


class Bank {
    private int money;

    /**
     * throws 异常类型用于声明抛出异常的类型
     * @param in
     * @param out
     * @throws BankException
     */
    public void income(int in, int out) throws BankException {
        if (in < 0 || out > 0 || in + out < 0) {
            // throw new BankException("收支不平衡");
            throw new BankException(in, out);
        }
        int netIncome = in + out;
        System.out.println("本次计算出的纯收入为:" + netIncome + "元");
        money = money + netIncome;
    }

    public int getMoney() {
        return money;
    }
}

/**
 * Exception is checkedException
 */
class BankException extends Exception {
    private String message;

    public BankException(int m, int n) {
        this.message = "入账资金" + m + "是负数或支出" + n + "是正数,不符合系统要求";
    }

    public BankException(String message) {
        this.message = message;
    }

    public String warnMessage() {
        return message;
    }

    @Override
    public void printStackTrace() {
        System.out.println(message);
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }
}