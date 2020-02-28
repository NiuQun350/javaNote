package cn.sxt.memberinnerclass;

/**
 * @author NiuQun
 * @2019/11/20
 */

/**
 * 外部类
 */
public class Body {
    /**
     * 成员内部类
     */
    public class Heart{
        /**
         * 内部类方法
         */
        public void beat() {
            System.out.println("心脏跳动！");
            // 下列写法是正确的
            System.out.println("我叫" + name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 外部类的成员变量
     */
    private String name;
    /**
     * 外部类方法
     */
    public void methodBody()
    {
        System.out.println("外部类的方法!");
        Heart heart = new Heart();
        heart.beat();

        new Heart().beat();

    }

}
