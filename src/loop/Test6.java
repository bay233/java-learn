package loop;

import sun.applet.resources.MsgAppletViewer;

import java.util.Map;
import java.util.concurrent.SynchronousQueue;

/**
 * @author:
 * @DATE: 2021/2/22
 */
public class Test6 {

    public static boolean bool(){
        System.out.println("布尔表达式");
        return true;
    }

    public static int val(){
        System.out.println("更新变量");
        return 0;
    }

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30};

        System.out.println("增强for循环中使用continue");
        for(int x : numbers ) {
            if( x == 20 ) {
                continue;
            }
            System.out.println( x );
        }

        System.out.println("\nfor循环中使用continue");
        for (int i = 0, j = 0; i < numbers.length && bool(); ++i, j = val()){
            if( numbers[i] == 20 ) {
                continue;
            }
            System.out.println( numbers[i] );
        }

        System.out.println("\nwhile循环中使用continue");
        int i = 0;
        while (i < numbers.length && bool()){
            int j = i;
            i++;
            if( numbers[j] == 20 ) {
                continue;
            }
            System.out.println( numbers[j] );
        }
    }
}
