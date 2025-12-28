package pattern.advanced;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ADPT17
 * Question     : Print a Reverse Alphabet Triangle
 * Title        : ReverseAlphabetTriangle.java
 * Author       : Sribinu P
 * Created On   : 28-12-2025
 * Topic        : Advanced Pattern (Reverse Alphabet Triangle)
 * Difficulty   : Easy
 * Description  : Prints a right-angled triangle where each row starts from Z and prints letters in descending order, increasing one letter per row.
 * ----------------------------------------------------------
 */

public class ReverseAlphabetTriangle {

    public static void main(String[] args) {
        // Program ADPT17: ReverseAlphabetTriangle
        // Start char = 'Z', print (row) letters, decrement character each time.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            char ch = 'Z';
            for (int j = 1; j <= i; j++) {
                System.out.printf(ch-- + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}

/* Output:
    Enter size N: 5
    Z
    Z Y
    Z Y X
    Z Y X W
    Z Y X W V
 */