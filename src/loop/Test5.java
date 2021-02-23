package loop;

/**
 * @author:
 * @DATE: 2021/2/22
 */
public class Test5 {

    public static void main(String args[]) {
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ) {
            // x 等于 30 时跳出循环
            if( x == 30 ) {
                break;
            }
            System.out.print( x );
            System.out.print("\n");
        }

        // 嵌套for循环时，break只会跳出包含它最里面的for循环
        for (int i = 0; i < 3; ++i){
            System.out.println("i: " + i);
            System.out.print("j: ");
            for (int j = 0; ; ++j){
                System.out.print(j + " ");
                if (j > i * 2){
                    break;
                }
            }
            System.out.println();
        }

    }
}
