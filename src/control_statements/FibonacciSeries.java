package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS16
 * Question     : Print Fibonacci series up to given terms.
 * Title        : FibonacciSeries.java
 * Author       : Sribinu P
 * Created On   : 25-11-2025
 * Topic        : Fibonacci Series
 * Difficulty   : Easy
 * Description  : This program prints the Fibonacci series up to a given number of terms.
 * ----------------------------------------------------------
 */

public class FibonacciSeries {

    public static void main(String[] args) {
        // Program CS16: FibonacciSeries
        // Starts with 0 and 1, then repeatedly adds the last two numbers to generate the series.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scan.nextInt();

        int a = 0, b = 1;
        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }

        scan.close();

    }
}

/* Output:
    Enter number of terms: 10
    Fibonacci Series up to 10 terms:
    0 1 1 2 3 5 8 13 21 34
 */