package pattern.alphabet;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : APT1
 * Question     : Print an alphabet triangle: A / A B / A B C ... up to N rows.
 * Title        : AlphabetTriangle.java
 * Author       : Sribinu P
 * Created On   : 16-12-2025
 * Topic        : Alphabet Pattern (Alphabet Triangle)
 * Difficulty   : Easy
 * Description  : Print an alphabet triangle starting from A, where each row prints characters from A up to the row number.
 * ----------------------------------------------------------
 */

public class AlphabetTriangle {

    public static void main(String[] args) {
        // Program APT1: AlphabetTriangle
        // Start ch = 'A' for each row and increment it using ch++
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    A
    A B
    A B C
    A B C D
    A B C D E
 */