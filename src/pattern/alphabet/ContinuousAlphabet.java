package pattern.alphabet;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : APT5
 * Question     : Print continuous alphabets across rows (wrap after Z).
 * Title        : ContinuousAlphabet.java
 * Author       : Sribinu P
 * Created On   : 16-12-2025
 * Topic        : Alphabet Pattern (Continuous Alphabet)
 * Difficulty   : Easy
 * Description  : Print letters sequentially and wrap after 'Z' to 'A'
 * ----------------------------------------------------------
 */

public class ContinuousAlphabet {

    public static void main(String[] args) {
        // Program APT5: ContinuousAlphabet
        // Keep one char variable, increment it, reset to 'A' after 'Z'
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(ch++ + " ");
                if (ch > 'Z') {
                    ch = 'A';
                }
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 6
    A B C D E F
    G H I J K L
    M N O P Q R
    S T U V W X
    Y Z A B C D
    E F G H I J
 */