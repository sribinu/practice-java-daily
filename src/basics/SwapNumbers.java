package basics;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : B4
 * Question     : Swap two numbers without using a third variable.
 * Title        : SwapNumbers.java
 * Author       : Sribinu P
 * Created On   : 18-11-2025
 * Topic        : Swap Numbers
 * Difficulty   : Easy
 * Description  : Swapping 2 numbers using arithmetic operations
 * ----------------------------------------------------------
 */

public class SwapNumbers {

    public static void main(String[] args) {
        // Program B4: SwapNumbers
        // Method 1 - Using arithmetic operators
        System.out.println("Method 1:");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = scan.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = scan.nextInt();
        System.out.println("Before swap num1 = " + num1 + " and num2 = " + num2);
                            // if num1 = 10, num2 = 20
        num1 = num1 + num2; // num1 = 10 + 20 = 30
        num2 = num1 - num2; // num2 = 30 - 20 = 10
        num1 = num1 - num2; // num1 = 30 - 10 = 20
        System.out.println("After swap num1 = " + num1 + " and num2 = " + num2);
        scan.close();

        // Method 2 - Using XOR operator
        System.out.println("Method 2:");
        int a = 10, b = 20;
        System.out.println("After swap a = " + a + " and b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap a = " + a + " and b = " + b);
    }
}

/* Output:
    Method 1:
        Enter num1 = 10
        Enter num2 = 20
        Before swap num1 = 10 and num2 = 20
        After swap num1 = 20 and num2 = 10
    Method 2:
        After swap a = 10 and b = 20
        After swap a = 20 and b = 10
 */