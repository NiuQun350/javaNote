package cn.niuke.title;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main{

    public static void main(String [] args) {
        //数组去重：以下是开发过程中使用较多且较快的2种方法
        String [] arrStr = {"Java", "C++", "Php", "C#", "Python", "C++", "Java"};
        //方法一：
        testA(arrStr);
        System.out.println("----------------------------");
        //方法二：
        testB(arrStr);
    }

    //方法一：通过list去重
    public static void testA(String [] arrStr) {
        List<String> list = new ArrayList<String>();
        for (int i=0; i<arrStr.length; i++) {
            if(!list.contains(arrStr[i])) {
                list.add(arrStr[i]);
            }
        }
        //返回一个包含所有对象的指定类型的数组
        String[] newArrStr =  list.toArray(new String[1]);
        System.out.println(Arrays.toString(newArrStr));
    }

    //方法二：通过map去重
    public static void testB(String [] arrStr) {
        Map<String, Object> map = new HashMap<String, Object>();
        for (String str : arrStr) {
            map.put(str, str);
        }
        //返回一个包含所有对象的指定类型的数组
        String[] newArrStr =  map.keySet().toArray(new String[1]);
        System.out.println(Arrays.toString(newArrStr));
    }

}