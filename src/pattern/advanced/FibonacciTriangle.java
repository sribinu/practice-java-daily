package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT6
 * Question     : Print an alphabet triangle where each cell shows Fibonacci sequence values.
 * Title        : FibonacciTriangle.java
 * Author       : Sribinu P
 * Created On   : 19-12-2025
 * Topic        : Advanced Pattern (Fibonacci Triangle)
 * Difficulty   : Medium
 * Description  : Print a triangle pattern where each cell displays Fibonacci sequence values (row-wise).
 * ----------------------------------------------------------
 */

public class FibonacciTriangle {

    public static void main(String[] args) {
        // Program ADPT6: FibonacciTriangle
        // Prints Fibonacci numbers continuously in a triangle shape
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        int num1 = 0, num2 = 1, num3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.printf("%4d", num1);
                    num3 = num1 + num2;
                    num1 = num2;
                    num2 = num3;
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
       0
       1   1
       2   3   5
       8  13  21  34
      55  89 144 233 377
 */