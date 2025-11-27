package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS22
 * Question     : Calculate power of a number without using Math.pow().
 * Title        : CalculatePower.java
 * Author       : Sribinu P
 * Created On   : 27-11-2025
 * Topic        : Power Calculation
 * Difficulty   : Easy
 * Description  : Calculate power (base^exponent) without Math.pow()
 * ----------------------------------------------------------
 */

public class CalculatePower {

    public static void main(String[] args) {
        // Program CS22: CalculatePower
        // Computes base^exponent by repeated multiplication.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scan.nextInt();

        System.out.print("Enter exponent: ");
        int exp = scan.nextInt();

        long result = power(base, exp);

        System.out.println(base + " ^ " + exp + " = " + result);

        scan.close();
    }

    public static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
}

/* Output:
    Enter base: 10
    Enter exponent: 3
    10 ^ 3 = 1000
 */