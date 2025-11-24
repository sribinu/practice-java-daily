package control_statements;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : CS8
 * Question     : Display weekday name based on number (1–7) using switch.
 * Title        : WeekdaySwitch.java
 * Author       : Sribinu P
 * Created On   : 23-11-2025
 * Topic        : Control Statements
 * Difficulty   : Very Easy
 * Description  : This program prints the weekday name for a given number from 1 to 7.
 * ----------------------------------------------------------
 */

public class WeekdaySwitch {

    public static void main(String[] args) {
        // Program CS8: WeekdaySwitch
        // Uses a switch-case to match the input number with its corresponding weekday.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1–7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number! Enter between 1 and 7.");
        }

        sc.close();

    }
}

/* Output:
    Enter a number (1–7): 1
    Monday
 */