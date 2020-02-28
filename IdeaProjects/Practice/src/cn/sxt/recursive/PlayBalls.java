package cn.sxt.recursive;

import java.util.Scanner;

/**
 * 现有四个人做传球游戏，要求接球后马上传给别人. 由甲先传球，并作为第1次传球，求经过n次传球仍然回到发球人甲手中的传球方式的种数
 * @author NiuQun
 * @2019/10/16
 */

public class PlayBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入传球的次数:");
        int playBallNumber = scanner.nextInt();
        int[] ballInA = new int[playBallNumber+1];
        int[] ballOutA = new int[playBallNumber+1];
        System.out.printf("当有%d次传球机会,且球最开始由甲开始传，经过%d次传球，球回到甲手中的传球方式种数为：%d", playBallNumber, playBallNumber, result(ballInA, ballOutA));

    }

    public static int result(int[] ballInA, int[] ballOutA) {
        // 球在甲手中，且还有一次传球机会
        ballInA[1] = 0;
        // 球不在甲手中，且还有一次机会
        ballOutA[1] = 1;
        for (int i = 2; i < ballInA.length; i++) {
            ballInA[i] = 3 * ballOutA[i-1];
            ballOutA[i] = 2 * ballOutA[i-1] + ballInA[i-1];
        }
        return ballInA[ballInA.length-1];
    }

}
