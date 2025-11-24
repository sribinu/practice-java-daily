package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS10
 * Question     : Find factorial of a number using for loop.
 * Title        : Factorial.java
 * Author       : Sribinu P
 * Created On   : 24-11-2025
 * Topic        : Factorial
 * Difficulty   : Easy
 * Description  : This program calculates the factorial of a given number.
 * ----------------------------------------------------------
 */

public class Factorial {

    public static void main(String[] args) {
        // Program CS10: Factorial
        // A for-loop multiplies numbers from 1 to N to compute the factorial.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        long fact = 1;

        for (int i=1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is : " + fact);
        scan.close();
    }
}

/* Output:
    Enter a number : 5
    Factorial of 5 is : 120
 */