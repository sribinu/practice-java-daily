package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS29
 * Question     : Check if a number is sunny or not.
 * Title        : SunnyNumberCheck.java
 * Author       : Sribinu P
 * Created On   : 29-11-2025
 * Topic        : Number check (sunny number)
 * Difficulty   : Easy
 * Description  : A number is considered Sunny if (number + 1) is a perfect square.
 * ----------------------------------------------------------
 */

public class SunnyNumberCheck {

    public static void main(String[] args) {
        // Program CS29: SunnyNumberCheck
        // Checks whether n+1 is a perfect square → if yes, number is sunny.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isSunny(num)) {
            System.out.println(num + " is a Sunny number.");
        } else {
            System.out.println(num + " is NOT a Sunny number.");
        }

        scan.close();
    }

    public static boolean isSunny(int num) {
        int check = num + 1;

        for (int i=1; i * i <= check; i++) {
            if (i * i == check) {
                return true;
            }
        }
        return false;
    }
}

/* Output:
    Enter a number: 80
    80 is a Sunny number.
 */