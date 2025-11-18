package basics;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : B5
 * Question     : Calculate simple interest for given P, T, R.
 * Title        : SimpleInterest.java
 * Author       : Sribinu P
 * Created On   : 18-11-2025
 * Topic        : Simple Interest
 * Difficulty   : Easy
 * Description  : Formula based calculation : Simple Interest (SI) = (P × T × R) / 100
 *                where, P = Principal (amount)
 *                       T = Time (in years)
 *                       R = Rate of interest (%)
 * ----------------------------------------------------------
 */

public class SimpleInterest {

    public static void main(String[] args) {
        // Program B5: SimpleInterest
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        double P = scan.nextDouble();
        System.out.print("Enter Time (in years) : ");
        double T = scan.nextDouble();
        System.out.print("Enter Rate (%) : ");
        double R = scan.nextDouble();

        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest = " + SI);

        scan.close();
    }
}

/* Output:
    Enter Principal : 10000
    Enter Time (in years) : 2
    Enter Rate (%) : 5
    Simple Interest = 1000.0
 */