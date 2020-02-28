package cn.ctgu.test4;

import java.util.*;

/**
 * @author NiuQun
 * @2019/12/23
 */

public class Practice {
    public static void main(String[] args) {
        Hero hero1 = new Hero("黄蓉", "桃花岛");
        Hero hero2 = new Hero("令狐冲", "华山派");
        Hero hero3 = new Hero("小龙女", "古墓派");
        Hero hero4 = new Hero("小龙女", "古墓派");
        Hero hero5 = new Hero("小龙女", "古墓派");
        Hero hero6 = new Hero("张无忌", "明教");
        Hero hero7 = new Hero("小龙女", "古墓派");
        Hero hero8 = new Hero("凑数用的", "Hello");

        List<Hero> list = new ArrayList<Hero>();
        list.add(hero1);
        list.add(hero2);
        list.add(hero3);
        list.add(hero4);
        list.add(hero5);
        list.add(hero6);
        list.add(hero7);
        list.add(hero8);


        List<Hero> list1 = new ArrayList<Hero>();
        list1.addAll(list);

        // 方法1：
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i).equals(hero4)) {
                list.remove(i);
            }
        }
        System.out.println(list);
        System.out.println(list1);

        //方法2：
        Iterator<Hero> iterator = list1.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(new Hero("小龙女", "古墓派"))) {
                iterator.remove();
            }
        }
        System.out.println(list1);
    }
}

class Hero {
    private String name;
    private String group;

    public Hero(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof Hero) {
            Hero hero = (Hero)obj;
            if ((this.name == hero.name)
                    && (this.group == hero.group))  {
                return true;
            }
        }
        return false;
    }
}