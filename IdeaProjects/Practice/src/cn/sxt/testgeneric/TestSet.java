package cn.sxt.testgeneric;

import java.util.HashSet;
import java.util.Set;

/**
 * Set接口继承至Collection,Set接口中没有新增方法，方法和Collection保持完全一致，我们在前面通过List学习的方法，在Set中仍然适用
 * Set容器特点:无序，不可重复，
 * 无序指Set中没有索引，我们只能比遍历查找
 * 不可重复指不允许加入重复的元素，更确切地讲，新元素如果和Set中某个元素通过equals()方法对比为true，则不能加入，
 * 甚至Set中也只能放入一个null元素，不能多个
 * Set常用的实现类有HashSet, TreeSet等，我们一般使用HashSet
 * HashSet实际上就是简化的HashMap, 填入的实际上就是HashMap中的Key，所以HashSet不可重复,且无序
 *
 * @author NiuQun
 * @2019/11/2
 */

public class TestSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("aa");
        set.add("bb");
        set.add("aa");
        set.add("cc");
        set.add("dd");
        System.out.println(set);
        set.remove("aa");
        System.out.println(set);



    }

}
