package pattern.alphabet;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : APT2
 * Question     : Print inverted alphabet triangle starting from row N down to A.
 * Title        : InvertedAlphabetTriangle.java
 * Author       : Sribinu P
 * Created On   : 16-12-2025
 * Topic        : Alphabet Pattern (Inverted Alphabet Triangle)
 * Difficulty   : Easy
 * Description  :
 * ----------------------------------------------------------
 */

public class InvertedAlphabetTriangle {

    public static void main(String[] args) {
        // Program APT2: InvertedAlphabetTriangle

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        char ch = (char) ('A' + n);

        for (int i = 1; i <= n; i++) {
            for (int j = ch; j >= 'A'; j--) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:

 */