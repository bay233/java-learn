package dataStructure;

import java.util.ArrayList;

/**
 * @author:
 * @DATE: 2021/2/22
 */
public class Test1 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        ArrayList<String> sites = new ArrayList<String>();
        // 添加元素
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        // 打印元素
        System.out.println(sites);

        // 获取元素
        System.out.println(sites.get(1));

        // 修改元素
        sites.set(1, "Wiki");
        System.out.println(sites);

        // 删除元素
        // 根据下标删除元素
        sites.remove(1);
        System.out.println(sites);
        // 根据元素内容删除元素
        sites.remove("Weibo");
        System.out.println(sites);

        // 计算大小，也就是列表中的元素数量
        System.out.println("sites中元素的数量:" + sites.size());


        sites.add("Spring");
        sites.add("Apache");

        // 列表的迭代
        System.out.print("使用for循环:");
        for (int i = 0; i < sites.size(); ++i){
            System.out.print(sites.get(i) + " ");
        }
        System.out.print("\n使用增强for循环:");
        for (String s: sites){
            System.out.print(s + " ");
        }
        System.out.print("\n使用forEach:");
        sites.forEach(s -> System.out.print(s + " "));
    }

}
