package dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author:
 * @DATE: 2021/2/22
 */
public class Test2 {

    public static void main(String[] args) {
        HashMap<String, String> Sites = new HashMap<String, String>();
        Sites.put("Google", "谷歌");
        Sites.put("baidu", "百度");

        System.out.println(Sites.get("Google"));
        System.out.println(Sites.get("baidu"));

        HashMap<String, String> sites = new HashMap<>();
        sites.put("谷歌", "https://www.google.com");
        sites.put("百度", "https://www.baidu.com");
        sites.put("菜鸟", "https://www.runoob.com");
        sites.put("淘宝", "https://www.taobao.com");
        System.out.println("sites中的值: " + sites.toString());

        // 获取元素
        System.out.println("获取key为'菜鸟'的值: " + sites.get("菜鸟"));

        // 删除元素
        sites.remove("菜鸟");
        System.out.println("删除key为'菜鸟'的键值对: " + sites);

        // 计算大小
        System.out.println("site的大小为: " + sites.size());

        // 判断key 是否存在
        System.out.println("判断key为'菜鸟'的元素是否存在: " + sites.containsKey("菜鸟"));

        // 遍历map
        // 向HashMap中添加的元素并不能保证有序性
        System.out.println("---------------------");
        System.out.println("使用entrySet 遍历map");
        Set<Map.Entry<String, String>> entries = sites.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print("(key: " + entry.getKey());
            System.out.print(", value: " + entry.getValue() + ")\n");
        }
        System.out.println("---------------------");
        System.out.println("使用keySet 获取所有的key 再使用key 遍历map");
        Set<String> strings = sites.keySet();
        for (String s: strings){
            System.out.println("(key: " + s + ", value: " + sites.get(s) + ")");
        }

    }
}
