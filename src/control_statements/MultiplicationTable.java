package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS14
 * Question     : Print multiplication table for a given number.
 * Title        : MultiplicationTable.java
 * Author       : Sribinu P
 * Created On   : 25-11-2025
 * Topic        : Multiplication Table
 * Difficulty   : Very Easy
 * Description  : This program prints the multiplication table of a given number from 1 to 10.
 * ----------------------------------------------------------
 */

public class MultiplicationTable {

    public static void main(String[] args) {
        // Program CS14: MultiplicationTable
        // Uses a for-loop to multiply the input number with values 1 through 10.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scan.nextInt();

        System.out.println("Multiplication Table of " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + num + " = " + (i*num));
        }

        scan.close();
    }
}

/* Output:
    Enter a number : 5
    Multiplication Table of 5:
    1 * 5 = 5
    2 * 5 = 10
    3 * 5 = 15
    4 * 5 = 20
    5 * 5 = 25
    6 * 5 = 30
    7 * 5 = 35
    8 * 5 = 40
    9 * 5 = 45
    10 * 5 = 50
 */