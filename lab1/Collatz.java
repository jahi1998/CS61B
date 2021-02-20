/** Class that prints the Collatz sequence starting from a given number.
 *  @author Jiahui Li
 */
import java.util.Scanner;

public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n) {
        if (n%2 == 0) {
            return n/2;
        } else {
            return 3*n+1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数");
        int n = input.nextInt();
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

