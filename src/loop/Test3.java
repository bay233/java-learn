package loop;

/**
 * @author:
 * @DATE: 2021/2/22
 */
public class Test3 {

    public static int init(){
        System.out.println("初始化语句");
        return 0;
    }
    public static boolean bool(){
        System.out.println("布尔表达式");
        return true;
    }

    public static int val(){
        System.out.println("更新变量");
        return 0;
    }

    public static void main(String args[]) {

        for(int x = 10, y = init(); x < 20 && bool(); x = x+1, y = val()) {
            System.out.println("value of x : " + x );
        }
    }
}
