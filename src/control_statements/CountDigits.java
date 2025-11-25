package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS13
 * Question     : Count number of digits in a number using loop.
 * Title        : CountDigits.java
 * Author       : Sribinu P
 * Created On   : 25-11-2025
 * Topic        : Count Digits
 * Difficulty   : Easy
 * Description  : This program counts how many digits a given number contains.
 * ----------------------------------------------------------
 */

public class CountDigits {
    public static void main(String[] args) {
        // Program CS13: CountDigits
        // Repeatedly divide the number by 10 in a loop and increment the counter.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " = " + count);

        scan.close();
    }
}

/* Output:
    Enter a number : 12345
    Number of digits in 0 = 5
 */