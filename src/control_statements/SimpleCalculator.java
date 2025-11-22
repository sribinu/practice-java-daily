package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS7
 * Question     : Build a simple calculator using switch statement.
 * Title        : SimpleCalculator.java
 * Author       : Sribinu P
 * Created On   : 22-11-2025
 * Topic        : Simple Calculator
 * Difficulty   : Very Easy
 * Description  : This program performs basic arithmetic operations using a switch statement.
 * ----------------------------------------------------------
 */

public class SimpleCalculator {

    public static void main(String[] args) {
        // Program CS7: SimpleCalculator
        // The operator is checked using switch-case, and the corresponding operation is executed.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Error: Division by zero!");
                break;

            case '%':
                if (b != 0)
                    System.out.println("Result = " + (a % b));
                else
                    System.out.println("Error: Modulo by zero!");
                break;

            default:
                System.out.println("Invalid operator!");
        }

        sc.close();
    }
}

/* Output:
    Enter first number: 100
    Enter second number: 200
    Enter operator (+, -, *, /, %): *
    Result = 20000.0
 */