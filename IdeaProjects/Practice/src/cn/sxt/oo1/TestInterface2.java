package cn.sxt.oo1;

/**
 * 接口的继承: 继承接口可以继承多个父接口,无论是子接口还是父接口，都要遵循接口的规则：
 * interface前边的访问修饰符必须是 public或者默认，其中的方法只能是抽象方法，不能有普通方法和构造方法
 * 接口中的方法必须时public abstract，不写也是
 * 接口中的属性必须是public static final, 不写也是
 *
 * interface A{}
 * interface B{}
 * interface C extends A,B{}
 */
public class TestInterface2 {
    public static void main(String[] args) {

    }

}
// 接口A
interface A {
    void testa();
}
// 接口B
interface  B {
    void testb();
}

interface C extends A, B {
    public void testc();
}

class MyClass implements C {
    @Override
    public void testa() {

    }

    @Override
    public void testb() {

    }

    @Override
    public void testc() {

    }
}