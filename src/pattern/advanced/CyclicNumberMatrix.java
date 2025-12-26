package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT15
 * Question     : Print a Cyclic Number Matrix (Row-wise Rotation) also called Circular Shift Number Pattern.
 * Title        : CyclicNumberMatrix.java
 * Author       : Sribinu P
 * Created On   : 26-12-2025
 * Topic        : Advanced Pattern (Cyclic Number Matrix)
 * Difficulty   : Easy
 * Description  : Prints a square matrix where each row is a cyclic left shift of numbers from 1 to N, wrapping back to 1 after N.
 * ----------------------------------------------------------
 */

public class CyclicNumberMatrix {

    public static void main(String[] args) {
        // Program ADPT15: CyclicNumberMatrix
        //Each row starts from its row number, increment and wrap after N.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 1; j <= n; j++) {
                System.out.printf(num++ + " ");
                if (num > n)
                    num = 1;
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 9
    1 2 3 4 5 6 7 8 9
    2 3 4 5 6 7 8 9 1
    3 4 5 6 7 8 9 1 2
    4 5 6 7 8 9 1 2 3
    5 6 7 8 9 1 2 3 4
    6 7 8 9 1 2 3 4 5
    7 8 9 1 2 3 4 5 6
    8 9 1 2 3 4 5 6 7
    9 1 2 3 4 5 6 7 8
 */