package loops;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : LO2
 * Question     : Print numbers from N to 1 using for loop.
 * Title        : ReverseNumberPrint.java
 * Author       : Sribinu P
 * Created On   : 01-12-2025
 * Topic        : Looping
 * Difficulty   : Easy
 * Description  : This program prints numbers from N down to 1 using a for loop.
 * ----------------------------------------------------------
 */

public class ReverseNumberPrint {

    public static void main(String[] args) {
        // Program LO2: ReverseNumberPrint
        // Starts from N → decrements down to 1.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scan.nextInt();

        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}

/* Output:
    Enter N: 5
    5 4 3 2 1
 */