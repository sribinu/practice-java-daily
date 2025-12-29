package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT18
 * Question     : Print a Centered Reverse Alphabet Triangle
 * Title        : CenteredReverseAlphabetTriangle.java
 * Author       : Sribinu P
 * Created On   : 29-12-2025
 * Topic        : Advanced Pattern (Centered Reverse Alphabet Triangle)
 * Difficulty   : Easy
 * Description  : Prints a centered triangle of alphabets where each row starts from a decreasing letter (Z, Y, X, …) and always ends at Z.
 * ----------------------------------------------------------
 */

public class CenteredReverseAlphabetTriangle {

    public static void main(String[] args) {
        // Program ADPT18: CenteredReverseAlphabetTriangle
        // Row start = 'Z' - (row - 1), print till Z, with (n - row) leading spaces.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            char ch = (char) ('Z' - i);
            for (int j = 1; j <= i; j++) {
                System.out.printf(++ch + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
        Z
       Y Z
      X Y Z
     W X Y Z
    V W X Y Z
 */