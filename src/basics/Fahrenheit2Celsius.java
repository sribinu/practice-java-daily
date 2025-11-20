package basics;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : B7
 * Question     : Convert Fahrenheit temperature to Celsius.
 * Title        : Fahrenheit2Celsius.java
 * Author       : Sribinu P
 * Created On   : 19-11-2025
 * Topic        : Fahrenheit to Celsius
 * Difficulty   : Easy
 * Description  : Formula Based Calculation : Celsius = (Fahrenheit - 32) × 5 / 9
 * ----------------------------------------------------------
 */

public class Fahrenheit2Celsius {

    public static void main(String[] args) {
        // Program B7: Fahrenheit2Celsius
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Temperature in celsius = " + celsius);

        double toFahrenheitBack = (celsius * 9/5) + 32;

        System.out.println("Temperature in fahrenheit = " + toFahrenheitBack);

        scan.close();
    }
}

/* Output:
    Enter temperature in Fahrenheit: 98.6
    Temperature in celsius = 37.0
    Temperature in fahrenheit = 98.6
 */