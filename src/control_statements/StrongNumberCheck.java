package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS20
 * Question     : Check if a number is strong (sum of factorial of digits = number).
 * Title        : StrongNumberCheck.java
 * Author       : Sribinu P
 * Created On   : 26-11-2025
 * Topic        : Number Check (Strong number)
 * Difficulty   : Easy
 * Description  : This program checks whether the given number is a Strong Number.
 * ----------------------------------------------------------
 */

public class StrongNumberCheck {

    public static void main(String[] args) {
        // Program CS20: StrongNumberCheck
        // Find factorial of each digit → sum them → compare with original number.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isStrong(num)) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is NOT a Strong number.");
        }

        scan.close();
    }

    public static boolean isStrong(int num) {
        if (num < 0)
            return false;

        int temp = num, sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return num == sum;
    }

    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
}

/* Output:
    Enter a number: 145
    145 is a Strong number.
 */