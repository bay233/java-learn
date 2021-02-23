package loop;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author:
 * @DATE: 2021/2/22
 */
public class Test4 {

    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};

        System.out.println("循环数组");
        for(int x : numbers ){
            System.out.print( x + " ");
        }
        System.out.println("\n循环可迭代对象");
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        for (Integer i : numberList) {
            System.out.print(i + " ");
        }

    }
}
