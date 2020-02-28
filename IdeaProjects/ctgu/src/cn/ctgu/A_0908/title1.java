package cn.ctgu.A_0908;
/*
在3*3的棋盘上,摆有八个棋子,每个棋子上标有1至8的某一数字.
棋盘中留有一个空格,空格用0来表示.空格周围的棋子可以移到
空格中.要求解的问题是：给出一种初始布局和目标布局,为了使题目简单,设目标状态为:
        1 2 3
        8 0 4
        7 6 5
        找到一种最少步骤的移动方法,实现从初始布局到目标布局的转变.
        输入描述
        输入初试状态,3*3的九个数字,空格用0表示.

        输出描述
        只有一行,该行只有一个数字,表示从初始状态到目标状态需要的最少移动次
        (若无法到达目标状态则输出-1).

        输入样例
        2 8 3
        1 0 4
        7 6 5

        输出样例
        4
*/
import java.util.Scanner;
import java.util.Arrays;

public class title1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[9];
        for (int i = 0; i < 9; i++) {
            arr1[i] = scanner.nextInt();
        }
    }
}
