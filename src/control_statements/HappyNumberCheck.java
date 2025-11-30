package control_statements;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ----------------------------------------------------------
 * Program No   : CS30
 * Question     : Check if a number is happy or not.
 * Title        : HappyNumberCheck.java
 * Author       : Sribinu P
 * Created On   : 30-11-2025
 * Topic        : Number check (Happy numberI)
 * Difficulty   : Easy
 * Description  : This program repeatedly calculates the sum of squares of digits of a number.
 *                If the process reaches 1, the number is Happy.
 *                If it enters a loop (detected using a HashSet), it is Unhappy.
 * ----------------------------------------------------------
 */

public class HappyNumberCheck {

    public static void main(String[] args) {
        // Program CS30: HappyNumberCheck
        // Repeatedly calculates sum of squares of digits until it becomes 1 or loops.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isHappy(num)) {
            System.out.println(num + " is a Happy number.");
        } else {
            System.out.println(num + " is NOT a Happy number.");
        }

        scan.close();
    }

    private static boolean isHappy(int num) {
        Set<Integer> seen = new HashSet<>();
        while (true) {
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += (digit * digit);
                num /= 10;
            }

            if (sum == 1)
                return true;

            if (seen.contains(sum))
                return false;

            seen.add(sum);
            num = sum;
        }

    }
}

/* Output:
    Enter a number: 19
    19 is a Happy number.

 */