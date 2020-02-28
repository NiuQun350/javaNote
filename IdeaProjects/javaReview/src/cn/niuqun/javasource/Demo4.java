package cn.niuqun.javasource;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author NiuQun
 * @2020/2/27
 */

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            Integer temp = random.nextInt(33) + 1;
            list.add(temp);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
