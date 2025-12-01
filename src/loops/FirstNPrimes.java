package loops;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : LO5
 * Question     : Print first N prime numbers.
 * Title        : FirstNPrimes.java
 * Author       : Sribinu P
 * Created On   : 01-12-2025
 * Topic        : Looping
 * Difficulty   : Easy
 * Description  : The program repeatedly checks numbers for primality and prints them until N primes are found.
 * ----------------------------------------------------------
 */

public class FirstNPrimes {

    public static void main(String[] args) {
        // Program LO5: FirstNPrimes
        // The program repeatedly checks numbers for primality and prints them until N primes are found.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = scan.nextInt();

        System.out.println("Primes number up to " + N + " :");
        for (int i = 1; i <= N; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }

        scan.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}

/* Output:
    Enter N : 20
    Primes number up to 20 :
    2 3 5 7 11 13 17 19
 */