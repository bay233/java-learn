package operator;

/**
 * @author:
 * @DATE: 2021/2/21
 */
public class Test1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );  // d++ 先返回d 的值再执行++操作
        System.out.println("++d   = " +  (++d) );  // ++d 先执行++操作再返回d 的值

        // String 类型的 + 运算
        String s1 = "Hello";
        String s2 = " 我叫暑月";
        System.out.println("s1 + s2 = " + s1 + s2);
    }
}
