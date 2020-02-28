package cn.sxt.oo1;

import java.util.Arrays;

/**
 * 测试基本数据类型数组和引用数据类型数组
 */
public class TestArrays2 {
    public static void main(String[] args) {
        // 静态初始化数组
        int[]  arr1 = {1, 3, 3, 5};

        int[] b2 = new int[]{1, 3, 5};

        User[] users = {
                new User("1001", "小明", 110),
                new User("1002", "大明",120),
                new User("1003", "Jone", 130),
        };

        // 默认初始化
        int[] arr2 = new int[3];  // 默认给数组的元素进行赋值，赋值的规则和成员变量默认赋值一样
        User[] users1 = new User[3];

        // 动态初始化
        int[] arr3 = new int[3];
        arr3[0] = 0;
        arr3[1] = 1;
        arr3[2] = 2;

        User[] users2 = new User[3];
        users2[0] = new User("1001", "小明", 110);
        users2[1] = new User("1002", "大明",120);
        users2[2] = new User("1003", "Jone", 130);

        String[] arr5 = new String[3];
        arr5[0] = "Hello Word";
        arr5[1] = new String("Hello World");
        System.out.println(arr5[1]);

        // 数组的声明
        int[] arr4;     // ==> int[] arr4 = null // 数组的声明
        // 声明的时候并没有实例化任何对象,只有在实例化数组对象时，JVM才分配空间,
        // 声明一个数组的时候并没有数组真正被创建
        // 构造一个数组，必须指定长度
        arr4 = new int[3];      // 给数组分配空间


        /* int[] arr4 = null;
           arr4[0] = 1;         这种写法编译能通过，但是运行不能通过
         */

        /**
         * 二维数组的使用
         */
        // 静态初始化二维数组
        int[][] a3 = {
                {1, 3, 5},
                {3},
                {5, 5, 6, 2}
        };

        // 默认初始化二维数组
        int [][] a1 = new int[3][];
        a1[0] = new int[2];
        a1[1] = new int[4];
        a1[2] = new int[6];
        // a1[3] = new int[3];   编译能通过，运行不能通过

        int [][] a2 = null;   // 先声明
        a2 = new int[3][];    // 后分配空间

        // 动态初始化二维数组
        int[][] b1 = new int[3][];
        b1[0] = new int[]{1, 3, 4};
        b1[1] = new int[]{3, 5, 6, 2};


        int [][] a4 = new int[3][];
        a4[0] = new int[2];
        a4[1] = new int[4];
        a4[2] = new int[6];

        a4[0] = new int[]{1,  3};   // 赋的是地址
        a4[1] = new int[]{1, 5};   // 赋的是地址
        System.out.println(Arrays.toString(a4[0]));
        System.out.println(Arrays.toString(a4[1]));


        User[][] users3 = new User[3][];
        users3[0] = new User[]{
                new User("1001", "小明", 110),
                new User("1002", "大明",120),
                new User("1003", "Jone", 130),
        };

        users3[1] = new User[] {
                new User("1001", "小明", 110),
                new User("1002", "大明",120),
                new User("1003", "Jone", 130),
        };







    }

}

class User {
    String id;
    String name;
    int score;

    User() {
        super();
    }

    User(String id, String name, int score) {
        super();
        this.id = id;
        this.name = name;
        this.score = score;
    }

    String getId() {
        return id;
    }

    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }

    void setId(String id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setScore(int score) {
        this.score = score;
    }

}