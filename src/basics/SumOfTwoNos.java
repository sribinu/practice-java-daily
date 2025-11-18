package basics;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : B3
 * Question     : Read two numbers and print their sum.
 * Title        : SumOfTwoNos.java
 * Author       : Sribinu P
 * Created On   : 17-11-2025
 * Topic        : Sum of Two Numbers
 * Difficulty   : Very Easy
 * Description  : Scanner class usage
 * ----------------------------------------------------------
 */

public class SumOfTwoNos {

    public static void main(String[] args) {
        // Program B3: SumOfTwoNos
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = scan.nextDouble();

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        scan.close();
    }
}

/* Output:
    Enter number 1: 10
    Enter number 2: 20
    Sum of 10.0 and 20.0 is 30.0
 */