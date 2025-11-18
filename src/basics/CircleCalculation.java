package basics;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : B6
 * Question     : Calculate area and circumference of a circle using final double PI.
 * Title        : CircleCalculation.java
 * Author       : Sribinu P
 * Created On   : 18-11-2025
 * Topic        : Circle Calculations
 * Difficulty   : Easy
 * Description  : Formula based calculations : Area = PI * r * r
 *                                             Circumference = 2 * PI * r
 *                                             PI = 3.14159
 * ----------------------------------------------------------
 */

public class CircleCalculation {

    public static void main(String[] args) {
        // Program B6: CircleCalculation
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle : ");
        double radius = scan.nextDouble();

        final double PI = 3.14159;

        double area = PI * radius * radius;
        System.out.println("Area of the circle = " + area);

        double circumference = 2 * PI * radius;
        System.out.println("Circumference of the circle = " + circumference);

        scan.close();
    }
}

/* Output:
    Enter the radius of the circle : 5
    Area of the circle = 78.53975
    Circumference of the circle = 31.4159
 */