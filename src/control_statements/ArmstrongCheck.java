package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS18
 * Question     : Check if a number is Armstrong or not.
 * Title        : ArmstrongCheck.java
 * Author       : Sribinu P
 * Created On   : 26-11-2025
 * Topic        : Number check (Armstrong)
 * Difficulty   : Easy
 * Description  : This program checks whether a given number is an Armstrong number for any digit length.
 * ----------------------------------------------------------
 */

public class ArmstrongCheck {

    public static void main(String[] args) {
        // Program CS18: ArmstrongCheck
        // Count digits → sum each digit raised to that count → compare with original.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        scan.close();
    }

    public static boolean isArmstrong(int num) {
        if (num < 0)
            return false;

        int temp1 = num, temp2 = num;
        int sum = 0, noOfDigits = 0;

        while (temp1 != 0) {
            temp1 /= 10;
            noOfDigits++;
        }

        while (temp2 > 0) {
            int digit = temp2 % 10;

            int product = 1;
            for (int i = 1; i <= noOfDigits; i++) {
                product *= digit;
            }
            sum += product;

            temp2 /= 10;
        }

        return  num == sum;
    }
}

/* Output 1:
    Enter a number: 153
    153 is an Armstrong number.

   Output 2:
    Enter a number: 9474
    9474 is an Armstrong number.
 */