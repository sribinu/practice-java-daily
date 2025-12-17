package pattern.alphabet;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : APT4
 * Question     : Print palindromic alphabet pyramid (A / ABA / ABCBA ...).
 * Title        : AlphabetPalindromicPyramid.java
 * Author       : Sribinu P
 * Created On   : 16-12-2025
 * Topic        : Alphabet Pattern (Palindromic Pyramid)
 * Difficulty   : Easy
 * Description  : Prints palindromic alphabet pyramid (A / ABA / ABCBA ...).
 * ----------------------------------------------------------
 */

public class AlphabetPalindromicPyramid {

    public static void main(String[] args) {
        // Program APT4: AlphabetPalindromicPyramid
        // Spaces = N-i, Increase = i, Decrease = i-1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            ch -= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
            A
          A B A
        A B C B A
      A B C D C B A
    A B C D E D C B A
 */