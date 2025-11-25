package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS15
 * Question     : Find sum of even and odd numbers separately up to N.
 * Title        : SumOfOddEven.java
 * Author       : Sribinu P
 * Created On   : 25-11-2025
 * Topic        : Sum of Odd/Even
 * Difficulty   : Very Easy
 * Description  : This program calculates the sum of even numbers and odd numbers separately up to N.
 * ----------------------------------------------------------
 */

public class SumOfOddEven {

    public static void main(String[] args) {
        // Program CS15: SumOfOddEven
        // Loop from 1 to N, check even/odd using %2, and add to respective sums.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        int num = scan.nextInt();
        int odd = 0 , even = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                odd += i;
            } else {
                even += i;
            }
        }

        System.out.println("Sum of even numbers up to " + num + " = " + even);
        System.out.println("Sum of odd numbers up to " + num + " = " + odd);

        scan.close();
    }
}

/* Output:
    Enter N : 10
    Sum of even numbers up to 10 = 30
    Sum of odd numbers up to 10 = 25
 */