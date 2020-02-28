package cn.niuqun.javasource;

import java.util.ArrayList;

/**
 * @author NiuQun
 * @2020/2/27
 */

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        System.out.println(list);
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person());
        list1.add(new Person());
        System.out.println(list1);
        System.out.println(list.toString());
        System.out.println(list1.toString());
        System.out.println(list.size());



    }
}
