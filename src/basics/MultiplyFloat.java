package basics;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : B10
 * Question     : Multiply two floating-point numbers and display the result.
 * Title        : MultiplyFloat.java
 * Author       : Sribinu P
 * Created On   : 19-11-2025
 * Topic        : Multiply Floating Numbers
 * Difficulty   : Very Easy
 * Description  : Multiplication of floating-point values
 * ----------------------------------------------------------
 */

public class MultiplyFloat {

    public static void main(String[] args) {
        // Program B10: MultiplyFloat
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        float num1 = scan.nextFloat();
        System.out.print("Enter number 2 : ");
        float num2 = scan.nextFloat();

        float result = num1 * num2;
        System.out.println("Multiplication = " + result);

        scan.close();
    }
}

/* Output:
    Enter number 1 : 12.2
    Enter number 2 : 23.4
    Multiplication = 285.47998
 */