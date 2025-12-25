package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT14
 * Question     : Print a Number–Alphabet Right Triangle with row-wise filling.
 * Title        : NumberAlphabetRightTriangle.java
 * Author       : Sribinu P
 * Created On   : 25-12-2025
 * Topic        : Advanced Pattern (Number–Alphabet Right Triangle)
 * Difficulty   : Easy
 * Description  : Prints a triangle where each row shows increasing numbers on the left and repeated alphabets on the right, decreasing per row.
 * ----------------------------------------------------------
 */

public class NumberAlphabetRightTriangle {

    public static void main(String[] args) {
        // Program ADPT14: NumberAlphabetRightTriangle
        // Left = 1→i numbers | Right = (n-i) same alphabets
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.printf(j + " ");
                } else {
                    System.out.printf(ch + " ");
                }
            }
            ch++;
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 7
    1 A A A A A A
    1 2 B B B B B
    1 2 3 C C C C
    1 2 3 4 D D D
    1 2 3 4 5 E E
    1 2 3 4 5 6 F
    1 2 3 4 5 6 7
 */