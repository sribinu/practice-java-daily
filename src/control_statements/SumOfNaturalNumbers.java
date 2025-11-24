package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS9
 * Question     : Calculate sum of first N natural numbers using for loop.
 * Title        : SumOfNaturalNumbers.java
 * Author       : Sribinu P
 * Created On   : 24-11-2025
 * Topic        : Sum of N Numbers
 * Difficulty   : Very Easy
 * Description  : This program calculates the sum of the first N natural numbers.
 * ----------------------------------------------------------
 */

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        // Program CS9: SumOfNaturalNumbers
        // A for-loop runs from 1 to N, adding each number to the sum.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;  // accumulate numbers
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}

/* Output:
    Enter N: 10
    Sum of first 10 natural numbers = 55
 */