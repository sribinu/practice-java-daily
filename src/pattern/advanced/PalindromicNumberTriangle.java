package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT7
 * Question     : Print a centered palindromic triangle of numbers using indices.
 * Title        : PalindromicNumberTriangle.java
 * Author       : Sribinu P
 * Created On   : 20-12-2025
 * Topic        : Advanced Pattern (Palindromic Number Triangle)
 * Difficulty   : Medium
 * Description  : This program prints a centered palindromic number triangle where each row forms
 *                a symmetric sequence that decreases to 1 and then increases back using loop indices.
 * ----------------------------------------------------------
 */

public class PalindromicNumberTriangle {

    public static void main(String[] args) {
        // Program ADPT7: PalindromicNumberTriangle
        // For row i → print (n−i) spaces, then numbers i→1 and 2→i to form a palindrome.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
 */