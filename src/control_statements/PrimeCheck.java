package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS17
 * Question     : Check if a number is prime.
 * Title        : PrimeCheck.java
 * Author       : Sribinu P
 * Created On   : 25-11-2025
 * Topic        : Prime number check
 * Difficulty   : Easy
 * Description  : This program checks whether a given number is a prime number.
 * ----------------------------------------------------------
 */

public class PrimeCheck {

    public static void main(String[] args) {
        // Program CS17: PrimeCheck
        // Tries dividing the number by all integers from 2 to √n to see if any divide it.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }

        scan.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

/* Output:
    Enter a number: 17
    17 is a prime number.

   Logic:
    A composite number must have a factor pair (a, b).
    If one factor is > √n, the other must be < √n.
    So checking divisors only up to √n is sufficient.
   Reason:
    i * i <= n is equivalent to i ≤ √n because if a number has a factor > √n, its pair must be < √n.
   Complexity benefit:
    Naive check for (i = 2; i <= n-1; i++)          → O(n) checks.
    Square-root check for (i = 2; i * i <= n; i++)  → O(√n) checks.
 */