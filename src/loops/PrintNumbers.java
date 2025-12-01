package loops;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : LO1
 * Question     : Print numbers from 1 to N using for, while, and do-while loops.
 * Title        : PrintNumbers.java
 * Author       : Sribinu P
 * Created On   : 01-12-2025
 * Topic        : Looping
 * Difficulty   : Very Easy
 * Description  : This program prints numbers from 1 to N using for loop, while loop, and do-while loop.
 * ----------------------------------------------------------
 */

public class PrintNumbers {

    public static void main(String[] args) {
        // Program LO1: PrintNumbers
        // Each loop type prints numbers from 1 to N.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scan.nextInt();

        System.out.println("Using for loop:");
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nUsing while loop:");
        int j = 1;
        while(j <= N) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\nUsing do while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while(k <= N);

        scan.close();
    }
}

/* Output:
    Enter N: 5
    Using for loop:
    1 2 3 4 5
    Using while loop:
    1 2 3 4 5
    Using do while loop:
    1 2 3 4 5
 */