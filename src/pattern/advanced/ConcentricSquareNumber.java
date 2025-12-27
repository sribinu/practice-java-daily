package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT16
 * Question     : Print a Concentric Square Number Pattern.
 * Title        : ConcentricSquareNumber.java
 * Author       : Sribinu P
 * Created On   : 27-12-2025
 * Topic        : Advanced Pattern (Concentric Square Number Pattern)
 * Difficulty   : Hard
 * Description  : Prints a concentric number diamond pattern using two mirrored halves with shrinking and expanding layers.
 * ----------------------------------------------------------
 */

public class ConcentricSquareNumber {

    public static void main(String[] args) {
        // Program ADPT16: ConcentricSquareNumber
        // Print descending numbers → repeat row value (2*i−1) times → print ascending numbers, then mirror it
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < (2 * i) - 1; j++) {
                System.out.print(i + " ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j < (2 * i) - 1; j++) {
                System.out.print(i + " ");
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    5 5 5 5 5 5 5 5 5
    5 4 4 4 4 4 4 4 5
    5 4 3 3 3 3 3 4 5
    5 4 3 2 2 2 3 4 5
    5 4 3 2 1 2 3 4 5
    5 4 3 2 2 2 3 4 5
    5 4 3 3 3 3 3 4 5
    5 4 4 4 4 4 4 4 5
    5 5 5 5 5 5 5 5 5
 */