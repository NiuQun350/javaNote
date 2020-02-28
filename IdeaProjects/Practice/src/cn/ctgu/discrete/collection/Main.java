package cn.ctgu.discrete.collection;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author NiuQun
 * @2019/12/13
 */

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashSet<String> setA = new HashSet<>();
        HashSet<String> setB = new HashSet<>();
        System.out.println("please input setA(按回车后读取每行输入的有效数据及自动结束):");
        setA = inputASet();
        System.out.println("please input setB(按回车后读取每行输入的有效数据及自动结束):");
        setB = inputASet();

        SetOperation setOperation = new SetOperation(setA, setB);
        System.out.println("A=" + setA);
        System.out.println("B=" + setB);
        System.out.println("A+B=" + setOperation.union());
        System.out.println("A*B=" + setOperation.intersection());
        System.out.println("A-B=" + setOperation.differenceSet());


    }

    /**
     * input a set
     * @return
     */
    public static HashSet<String> inputASet() {
        HashSet<String> tempSet = new HashSet<>();
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                break;
            } else {
                tempSet.add(str);
            }
        }
        return tempSet;
    }
}

class SetOperation {
    HashSet<String> setA;
    HashSet<String> setB;

    /**
     * constructor
     * @param setA
     * @param setB
     */
    public SetOperation(HashSet<String> setA, HashSet<String> setB) {
        this.setA = setA;
        this.setB = setB;
    }

    public void setSetA(HashSet<String> setA) {
        setA = setA;
    }
    public void setSetB(HashSet<String> setB) {
        setB = setB;
    }

    public HashSet<String> getSetA() {
        return setA;
    }
    public HashSet<String> getSetB() {
        return setB;
    }

    public HashSet<String> union() {
        HashSet<String> tempSet = new HashSet<String>();
        tempSet.addAll(setA);
        tempSet.addAll(setB);
        return tempSet;
    }

    public HashSet<String> intersection() {
        HashSet<String> tempSet = new HashSet<String>();
        tempSet.addAll(setA);
        tempSet.retainAll(setB);
        return tempSet;
    }

    public HashSet<String> differenceSet() {
        HashSet<String> tempSet = new HashSet<String>();
        tempSet.addAll(setA);
        tempSet.removeAll(setB);
        return tempSet;
    }

}

