package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR2
 * Question     : Find length of string without using .length().
 * Title        : StringLength.java
 * Author       : Sribinu P
 * Created On   : 29-01-2026
 * Topic        : String (Length)
 * Difficulty   : Easy
 * Description  : This program calculates the length of a string manually by counting characters one by one, without using the built-in .length() method.
 * ----------------------------------------------------------
 */

public class StringLength {

    public static void main(String[] args) {
        // Program STR2: StringLength
        // Convert the string to a character array and count the characters.
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        int count = 0;

        for (char c : str.toCharArray()) {
            count++;
        }

        System.out.println("Length of the string: " + count);
        scan.close();
    }
}

/* Output:
    Enter a string:
    java program
    Length of the string: 12
 */