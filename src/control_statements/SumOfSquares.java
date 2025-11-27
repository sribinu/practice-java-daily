package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS23
 * Question     : Find sum of series 1² + 2² + 3² + … + N².
 * Title        : SumOfSquares.java
 * Author       : Sribinu P
 * Created On   : 27-11-2025
 * Topic        : Sum of Series
 * Difficulty   : Easy
 * Description  : Add the square of each number from 1 to N using a loop.
 * ----------------------------------------------------------
 */

public class SumOfSquares {

    public static void main(String[] args) {
        // Program CS23: SumOfSquares
        // Adds the squares of numbers from 1 to N.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int num = scan.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += (i * i);
        }

        System.out.println("Sum of series 1^2 + 2^2 + ... + " + num + "^2 = " + sum);

        scan.close();
    }
}

/* Output:
    Enter N: 10
    Sum of series 1^2 + 2^2 + ... + 10^2 = 385
 */