package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR12
 * Question     : Count digits and special characters in a string.
 * Title        : CountDigitAndSpecialCharacter.java
 * Author       : Sribinu P
 * Created On   : 08-02-2026
 * Topic        : String (Count Digits and Special Characters)
 * Difficulty   : Easy
 * Description  : This program counts: Digits (0–9) & Special characters (symbols like @ # $ % etc.)
 *                Spaces and letters are ignored.
 * ----------------------------------------------------------
 */

public class CountDigitAndSpecialCharacter {

    public static void main(String[] args) {
        // Program STR12: CountDigitAndSpecialCharacter
        // Use Character.isDigit() and exclude letters/spaces to count special characters.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        int digits = 0, specialCharacters = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isLetter(ch) && ch != ' ') {
                specialCharacters++;
            }
        }

        System.out.println("Digits count: " + digits);
        System.out.println("Special Characters count: " + specialCharacters);
        scan.close();
    }
}

/* Output:
    Enter the string: Hello@123 #World!
    Digits count: 3
    Special Characters count: 3
 */

/* Another Logic: // Special characters = not letter, not digit, not space.
    if (ch >= '0' && ch <= '9')
        digits++;
    else if (!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z') && ch != ' ')
        special++;
 */