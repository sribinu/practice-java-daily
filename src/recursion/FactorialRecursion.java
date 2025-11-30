package recursion;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : RE1
 * Question     : Find factorial of a number using for recursion.
 * Title        : recursion.FactorialRecursion.java
 * Author       : Sribinu P
 * Created On   : 30-11-2025
 * Topic        : Factorial (using recursion)
 * Difficulty   : Easy
 * Description  : This program calculates factorial of a number using  a recursive function where n! = n × (n-1)!.
 * ----------------------------------------------------------
 */

public class FactorialRecursion {

    public static void main(String[] args) {
        // Program RE1: recursion.FactorialRecursion
        // Recursively multiplies n with factorial of (n-1).

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        long result = factorial(num);
        System.out.println("Factorial of " + num + " = " + result);

        scan.close();
    }

    private static long factorial(int num) {
        System.out.println("num = " + num);
        if (num == 0)
            return 1;

        return num * factorial(num -1); // Recursive call
    }
}

/* Output:
    Enter a number: 5
    Factorial of 5 = 120
 */