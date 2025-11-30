package recursion;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : RE2
 * Question     : Print Fibonacci series up to given term using recursion.
 * Title        : FibonacciRecursion.java
 * Author       : Sribinu P
 * Created On   : 30-11-2025
 * Topic        : Fibonacci (using recursion)
 * Difficulty   : Medium
 * Description  : This program prints Fibonacci series using a recursive function fib(n) = fib(n-1) + fib(n-2).
 * ----------------------------------------------------------
 */

public class FibonacciRecursion {

    public static void main(String[] args) {
        // Program RE2: FibonacciRecursion
        // Calls recursive fib() for each term.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scan.nextInt();

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scan.close();
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

/* Output:
    Enter number of terms: 10
    Fibonacci Series: 0 1 1 2 3 5 8 13 21 34
 */