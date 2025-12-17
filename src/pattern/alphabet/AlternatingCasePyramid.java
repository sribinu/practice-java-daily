package pattern.alphabet;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : APT7
 * Question     : Print pyramid switching uppercase/lowercase each row.
 * Title        : AlternatingCasePyramid.java
 * Author       : Sribinu P
 * Created On   : 17-12-2025
 * Topic        : Alphabet Pattern (Case Switch Alphabet Pyramid)
 * Difficulty   : Easy
 * Description  : Prints a centered pyramid where odd rows use uppercase letters and even rows use lowercase letters.
 * ----------------------------------------------------------
 */

public class AlternatingCasePyramid {

    public static void main(String[] args) {
        // Program APT7: AlternatingCasePyramid
        // Use one letter per row (ch++), repeat it i times, and switch case using i % 2 while centering with n − i spaces.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n- i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1)
                    System.out.print(ch + " ");
                else
                    System.out.print(Character.toLowerCase(ch) + " ");
            }
            ch++;
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
        A
       b b
      C C C
     d d d d
    E E E E E
 */