package pattern.mixed;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : MPT2
 * Question     : Print a square of size N where borders show increasing numbers.
 * Title        : NumberBorderSquare.java
 * Author       : Sribinu P
 * Created On   : 18-12-2025
 * Topic        : Mixed Pattern (Number Border Square)
 * Difficulty   : Easy
 * Description  :
 * ----------------------------------------------------------
 */

public class NumberBorderSquare {

    public static void main(String[] args) {
        // Program MPT2: NumberBorderSquare

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.printf("%3s" , num++ + " ");
                else
                    System.out.printf("%3s" , "  ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
     1  2  3  4  5
     6           7
     8           9
    10          11
    12 13 14 15 16
 */