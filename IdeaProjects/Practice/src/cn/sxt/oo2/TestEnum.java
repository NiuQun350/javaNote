package cn.sxt.oo2;

/**
 * enum 枚举名 {
 *     枚举体(常量列表)
 * }
 * 所有的枚举类型隐性的继承自java.lang.Enum, 枚举实质上还是类，而且每个被枚举的成员实质上就是一个枚举类型的实例
 * 它们默认都是public static final修饰的，可以直接通过枚举类型名使用它们
 * 当需要定义一组常量时，可以使用枚举类型
 * 尽量不要使用枚举类型的高级特性，事实上高级特性都可以使用普通类来实现，没有必要引入枚举增加程序的复杂性
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        Season a = Season.AUTUMN;
        switch (a) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

enum Week {
    星期一, 星期二, 星期三, 星期四, 星期五, 星期六, 星期日
}