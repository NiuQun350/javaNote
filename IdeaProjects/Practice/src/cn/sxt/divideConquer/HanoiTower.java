package cn.sxt.divideConquer;

/**
 * @author NiuQun
 * @2019/10/21
 */


public class HanoiTower {
    public static void main(String[] args) {
        hanoiTower(2, 'A', 'B', 'C');
    }

    public static void hanoiTower(int num, char a, char b, char c) {
        // 如果只有一个盘sout
        if (num == 1) {
            System.out.println("第1个盘从" + a + "->" + c);
        } else {
            // 1.把最上边的盘借助c盘 从a盘移动到b盘
            hanoiTower(num - 1, a, c, b);
            // 2.把最下边的盘 从a盘移动到c盘
            System.out.println("第" + num + "个盘从" + a + "->" + c);
            // 3.把b塔的所有盘借助a盘 从b移动到c,
            hanoiTower(num - 1, b, a, c);
        }
    }

}
