package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR11
 * Question     : Count uppercase and lowercase letters.
 * Title        : CountUpperAndLowerCase.java
 * Author       : Sribinu P
 * Created On   : 08-02-2026
 * Topic        : String (Count Uppercase & Lowercase Letters)
 * Difficulty   : Easy
 * Description  : This program counts how many uppercase and lowercase letters are present in a given string.
 *                Digits, spaces, and symbols are ignored.
 * ----------------------------------------------------------
 */

public class CountUpperAndLowerCase {

    public static void main(String[] args) {
        // Program : CountUpperAndLowerCase
        // ASCII based theory.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        int uppercases = 0, lowercases = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uppercases++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowercases++;
            }
        }

        System.out.println("Uppercase letters: " + uppercases);
        System.out.println("Lowercase letters: " + lowercases);
        scan.close();

    }
}

/* Output:
    Enter the string: Java Programming
    Uppercase letters: 2
    Lowercase letters: 13
 */

/* Another Logic: // Use Character class methods instead of ASCII for cleaner code.
        int upper = 0, lower = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }
        }
 */