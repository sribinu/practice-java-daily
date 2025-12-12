package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT13
 * Question     : Print pattern where each cell shows sum of row and column indices.
 * Title        : SumIndex.java
 * Author       : Sribinu P
 * Created On   : 12-12-2025
 * Topic        : Number Pattern (Sum Index)
 * Difficulty   : Easy
 * Description  : For i=1..N and j=1..N, print (i + j).
 * ----------------------------------------------------------
 */

public class SumIndex {

    public static void main(String[] args) {
        // Program NPT13: SumIndex
        // cell = i + j
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                    System.out.print((i + j) + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    2 3 4 5 6
    3 4 5 6 7
    4 5 6 7 8
    5 6 7 8 9
    6 7 8 9 10
 */