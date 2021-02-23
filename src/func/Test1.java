package func;

import java.util.Random;

/**
 * @author:
 * @DATE: 2021/2/23
 */
public class Test1 {
    private Random rd;

    public Test1(){
        System.out.println("调用构造函数");
        this.rd = new Random();
    }

    public void fun1(){
        System.out.println("调用无放回值函数");
    }

    public int fun2(){
        System.out.println("调用int 返回值类型函数");
        return rd.nextInt(100);
    }

    public int fun2(int range){
        System.out.println("调用fun2的重载函数函数");
        return rd.nextInt(range);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.fun1();
        int i = t.fun2();
        System.out.println("fun2 的返回值为: " + i);

        int j = t.fun2(10);
        System.out.println("fun2 的重载函数返回值为: " + j);
    }
}
