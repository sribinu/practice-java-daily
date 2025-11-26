package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS19
 * Question     : Check if a number is perfect or not.
 * Title        : PerfectNumberCheck.java
 * Author       : Sribinu P
 * Created On   : 26-11-2025
 * Topic        : Number check (Perfect number)
 * Difficulty   : Easy
 * Description  : This program checks whether a given number is a perfect number.
 * ----------------------------------------------------------
 */

public class PerfectNumberCheck {

    public static void main(String[] args) {
        // Program CS19: PerfectNumberCheck
        // Sum all proper divisors of the number and compare with the original.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is NOT a perfect number.");
        }

        scan.close();
    }

    public static boolean isPerfect(int num) {
        if (num < 0)
            return false;

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }

        return num == sum;
    }
}

/* Output:
    Enter a number: 28
    28 is a perfect number.
 */