package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS24
 * Question     : Check if a number’s square ends with the same number.
 * Title        : AutomorphicNumberCheck.java
 * Author       : Sribinu P
 * Created On   : 28-11-2025
 * Topic        : Number check (Automorphic number)
 * Difficulty   : Easy
 * Description  : Check if a number is Automorphic
 * ----------------------------------------------------------
 */

public class AutomorphicNumberCheck {

    public static void main(String[] args) {
        // Program CS24: AutomorphicNumberCheck
        // Checks if the square of a number ends with the number itself.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is NOT an Automorphic number.");
        }

        scan.close();
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        while (num > 0) {
            if (square % 10 != num % 10) {
                return false;
            }
            square /= 10;
            num /= 10;
        }

        return true;
    }
}

/* Output:
    Enter a number: 25
    25 is an Automorphic number.
 */