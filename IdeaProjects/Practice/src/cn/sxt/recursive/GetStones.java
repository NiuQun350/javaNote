package cn.sxt.recursive;

import java.util.Scanner;

/**
 * 100个物品，两个玩家a, b轮流从这堆物品中取物，规定每次可以取的数目，可以是1, 3, 4, 6;最后一次取光者获胜，问：为了获胜，应该先取还是后取，应采取什么策略
 *
 * 思路: 以物品个数为递推变量，judge[i] = 1表示物品个数为i时先取的人可以赢，judge[i] = 0表示先取必然输
 *
 * @author NiuQun
 * @2019/10/16
 */

public class GetStones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入物品数目(要求数目大于等于7)：");
        int thingsNumber = scanner.nextInt();
        boolean[] judge = new boolean[thingsNumber+1];
        System.out.printf("%d个物品，先手者结果为:%s", thingsNumber, game(judge));


    }

    public static boolean game(boolean[] judge) {
        judge[0] = false;
        judge[1] = true;
        judge[2] = false;
        judge[3] = true;
        judge[4] = true;
        judge[5] = true;
        judge[6] = true;
        for (int i = 7; i < judge.length; i++) {
            judge[i] = ! (judge[i-1] && judge[i-3] && judge[i-4] && judge[i-6]);
        }
        return judge[judge.length-1];
    }
}
