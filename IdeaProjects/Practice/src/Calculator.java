import java.util.Arrays;

/**
 * JUnit:
 * 单元测试是针对最小的功能单元编写测试代码
 * Java程序最小的功能单元就是方法
 * 单元测试就是针对单个Java方法的测试
 * 测试驱动开发TDD（Test-Driven-Development）
 * 编写接口---编写测试---编写实现---测试运行---任务完成
 *
 * 单元测试的好处：
 * 1.确保单个方法运行正常
 * 2.如果修改了方法代码，只需要确保其对应的单元测试通过
 * 3.测试代码本身就可以作为示例代码
 * 4.可以自动化运行所有测试并获得报告（包括成功的测试、失败的测试、测试代码的覆盖率（即有多少代码经过了测试））
 *
 * JUnit的设计：
 * 1.TestCase: 一个TestCase表示一个测试
 * 2.TestSuite:一个TestSuite包含一组TestCase，表示一组测试
 * 3.TestFixture:表示一个测试环境
 * 4.TestResult:用于收集测试结果
 * 5.TestRunner: 用于运行测试
 * 6.TestListener:用于监听测试过程，收集测试数据
 * 7.Assert:用于断言测试结果时候正确
 * 
 * @author NiuQun
 * @2019/11/21
 */

public class Calculator {
    public int calculate(String expression) {
        // split函数是用于使用特定的切割符（regex）来分隔字符串成一个字符串数组，函数返回是一个数组。在其中每个出现regex的位置都要进行分解
        String[] ss = expression.split("\\+");
        System.out.println(expression + "==>" + Arrays.toString(ss));
        int sum = 0;
        for (String s:ss) {
            sum = sum + Integer.parseInt(s);
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int r = c.calculate("1+2+3");
        System.out.println(r);
    }

}
