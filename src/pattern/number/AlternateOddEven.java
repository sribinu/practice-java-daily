package pattern.number;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : NPT11
 * Question     : Print pyramid where odd rows and even rows have different sequences.
 * Title        : AlternateOddEven.java
 * Author       : Sribinu P
 * Created On   : 12-12-2025
 * Topic        : Number Pattern (Alternate Odd/Even Rows Pyramid)
 * Difficulty   : Easy
 * Description  : Odd rows print 1..i, even rows print even numbers.
 * ----------------------------------------------------------
 */

public class AlternateOddEven {

    public static void main(String[] args) {
        // Program NPT11: AlternateOddEven
        // odd rows - j , even rows - j * 2
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print((j * 2) + " ");
                }
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    1
    2 4
    1 2 3
    2 4 6 8
    1 2 3 4 5
 */