package cn.sxt.generic;

/**
 * @author NiuQun
 * @2019/9/14
 *
 *                         ====>(interface)Set   HashSet
 * (interface)Collection
 *                         ====>(interface)List  对应的实现类:ArrayList(主要使用，其底层实现是数组) LinkedList Vector(其底层也是数组)
 *     List:有顺序，可重复
 *     Set:没有顺序，不可重复
 *
 *
 * (interface)Map          ====>(interface)Map   HashMap
 */


/**
 * 测试Collection中的方法
 * @author NiuQun
 */
import java.util.*;
public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        // size()方法返回容器大小
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.add("dfdf");
        c.add("dfdfdjkldl");

        System.out.println(c.toString());
        // 这两者相等
        System.out.println(c);

        System.out.println("##################");
        // toArray() 方法用于转化出一个Object数组
        Object[] objs = c.toArray();
        // 打印的是该数组的地址
        System.out.println(objs);
        System.out.println("##################");

        // contains()方法用于判断容器类是否包含某个对象
        System.out.println(c.contains("dfdf"));
        System.out.println(c.contains("dfjdkfdjfk"));

        // remove删除的只是栈中存的地址，实际上原来的"dfdf"依然存在
        c.remove("dfdf");
        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());

        System.out.println("****************");
        // 尖括号里边必须是类或者包装类， 不能是基本数据类型
        //Collection c1 = new ArrayList();
        Collection<Integer> c1 = new ArrayList<Integer>();
        // Collection<Integer> c1 = new ArrayList<>();
        // Collection<int> c1 = new ArrayList<int>();  // error
        c1.add(5);
        System.out.println(c1);
        System.out.println("***************");

        List<String> list01 = new ArrayList<>();
        list01.add("aa");
        list01.add("bb");
        list01.add("cc");
        System.out.println(list01);

        List<String> list02 = new ArrayList<>();
        list02.add("efd");
        list02.add("fdfd");
        System.out.println(list02);

        // 方法addAll() 用于将一个容器中的对象添加到另一个容器中
        list01.addAll(list02);
        System.out.println(list01);
        System.out.println(list02);

        System.out.println("***********************");
        // 方法removeAll() 用于移除一个容器和另一个容器中相同的部分
        list01.removeAll(list02);
        System.out.println(list01);

        System.out.println("************************");
        // 方法containsAll() 用于判断一个容器中是否包含了另一个容器的所有部分
        System.out.println(list01.containsAll(list02));

        list01.addAll(list02);
        System.out.println("list01:" + list01);
        System.out.println("list01:" + list02);

        // retainAll()方法用于移出一个容器中和另一个容器不一样的部分，仅仅保留该容器中和另一个容器中相同的部分
        list01.retainAll(list02);
        System.out.println(list01);
        System.out.println(list02);


        System.out.println("*************************");
        List<String> list04 = new ArrayList<>();
        list04.add("AAAAAAA");
        list04.add("EEEEEEEEEEEE");
        list04.add("FFFFFFFFF");
        System.out.println(list04);
        // ArrayList中add() 方法用于在指定位置插入指定的对象
        list04.add(1, "aaaaa");

        System.out.println(list04);
        // ArrayList中remove() 方法用于移除指定位置的对象,也可以移除指定的对象
        list04.remove(0);
        System.out.println(list04);

        // ArrayList中set()方法用于直接指定指定位置的对象,相当于直接修改,只能修改，不能添加，即index的范围为[0~length-1]
        list04.set(1, "wswsws");
        System.out.println(list04);

        System.out.println(list04.get(2));

        // indexOf() 方法返回容器中第一次出现指定对象的索引位置, 若没有则返回-1
        System.out.println(list04.indexOf("wswsws"));
        list04.add(3, "wswsws");
        System.out.println(list04);
        // lastIndexOf() 方法用于返回最后一次出现指定对象的索引位置
        System.out.println(list04.lastIndexOf("wswsws"));

        List<String> list = new ArrayList<>();


    }
}