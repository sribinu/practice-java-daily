package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT12
 * Question     : Print an odd number star triangle
 * Title        : OddNumberStarTriangle.java
 * Author       : Sribinu P
 * Created On   : 24-12-2025
 * Topic        : Advanced Pattern (Odd Number Star Triangle)
 * Difficulty   : Easy
 * Description  : Prints a triangle where each row contains the first i odd numbers, separated by *.
 * ----------------------------------------------------------
 */

public class OddNumberStarTriangle {

    public static void main(String[] args) {
        // Program ADPT11: OddNumberStarTriangle
        // Print increasing odd numbers in each row and separate them using '*'
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int odd = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(odd);
                if(j < i)
                    System.out.print("*");

                odd += 2;
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    1
    1*3
    1*3*5
    1*3*5*7
    1*3*5*7*9
 */