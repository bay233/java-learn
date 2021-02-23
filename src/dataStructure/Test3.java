package dataStructure;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author:
 * @DATE: 2021/2/23
 */
public class Test3 {

    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<String>();
        // 添加元素
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        System.out.println(sites);

        // 判断元素是否存在集合中
        System.out.println("判断'Google'是否存在集合当中: " + sites.contains("Google"));

        // 删除集合中的元素
        sites.remove("Google");
        System.out.println("删除'Google'元素: " + sites);

        // 计算集合中的大小
        System.out.println("计算集合的大小: " + sites.size());

        // 删除集合中所有的元素
        sites.clear();
        System.out.println("删除集合所有的元素: " + sites);

        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 遍历集合
        System.out.println("----------------------");
        System.out.println("使用增强for循环");
        for (String s: sites){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("----------------------");
        System.out.println("使用迭代器迭代");
        Iterator<String> iter = sites.iterator();
        while (iter.hasNext()){
            String s = iter.next();
            System.out.print(s + " ");
        }
    }
}
