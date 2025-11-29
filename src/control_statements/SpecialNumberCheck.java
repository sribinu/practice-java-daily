package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS28
 * Question     : Check if a number is special or not.
 * Title        : SpecialNumberCheck.java
 * Author       : Sribinu P
 * Created On   : 29-11-2025
 * Topic        : Number check (special number)
 * Difficulty   : Easy
 * Description  : This program checks whether a number is a Special Number by verifying
 *                if (sum of digits + product of digits) equals the original number.
 * ----------------------------------------------------------
 */

public class SpecialNumberCheck {

    public static void main(String[] args) {
        // Program CS28: SpecialNumberCheck
        // Adds digit-sum and digit-product → compares with original number.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isSpecial(num)) {
            System.out.println(num + " is a Special number.");
        } else {
            System.out.println(num + " is NOT a Special number.");
        }

        scan.close();
    }

    public static boolean isSpecial(int num) {
        int sum = 0, product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return num == (sum + product);
    }
}

/* Output:
    Enter a number: 59
    59 is a Special number.
 */