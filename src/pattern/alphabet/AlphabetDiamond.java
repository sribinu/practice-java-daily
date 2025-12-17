package pattern.alphabet;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : APT6
 * Question     : Print diamond pattern using alphabets (A...).
 * Title        : AlphabetDiamond.java
 * Author       : Sribinu P
 * Created On   : 17-12-2025
 * Topic        : Alphabet Pattern (Diamond)
 * Difficulty   : Intermediate
 * Description  : Prints a palindromic alphabet pyramid joined with its inverted form to create a diamond shape.
 * ----------------------------------------------------------
 */

public class AlphabetDiamond {

    public static void main(String[] args) {
        // Program APT6: AlphabetDiamond
        // Spaces = |n - i| , Letters - |j <= i|, |i - 1| (palindrome)
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
            ch-= 2;
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            ch-= 2;
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
      A B C D C B A
        A B C B A
          A B A
            A
 */