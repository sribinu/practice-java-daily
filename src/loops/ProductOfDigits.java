package loops;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : LO7
 * Question     : Calculate product of digits of a number.
 * Title        : ProductOfDigits.java
 * Author       : Sribinu P
 * Created On   : 01-12-2025
 * Topic        : Looping
 * Difficulty   : Very Easy
 * Description  : This program multiplies each digit of the number to calculate the total product of its digits.
 * ----------------------------------------------------------
 */

public class ProductOfDigits {

    public static void main(String[] args) {
        // Program LO7: ProductOfDigits
        // The program extracts each digit from the number and multiply them to compute the digit product.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }

        System.out.println("Product of digits = " + product);
        sc.close();
    }
}

/* Output:
    Enter a number: 1234
    Product of digits = 24
 */