package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR16
 * Question     : Replace all occurrences of a character with another.
 * Title        : ReplaceCharacter.java
 * Author       : Sribinu P
 * Created On   : 12-02-2026
 * Topic        : String (Replace Character)
 * Difficulty   : Easy
 * Description  : This program replaces every occurrence of a given character in a string with another character.
 * ----------------------------------------------------------
 */

public class ReplaceCharacter {

    public static void main(String[] args) {
        // Program STR16: ReplaceCharacter
        // This program replaces every occurrence of a given character in a string with another character.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        System.out.print("Enter the character to replace: ");
        char charToReplace = scan.next().charAt(0);

        System.out.print("Enter replacing character: ");
        char replacingChar = scan.next().charAt(0);

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == charToReplace) {
                result += replacingChar;
            } else {
                result += ch;
            }
        }

        System.out.println("Character replaced string: " + result);
        scan.close();
    }
}

/* Output:
    Enter a string: banana
    Enter the character to replace: a
    Enter replacing character: o
    Character replaced string: bonono
 */

/* Another Logic:
        String result = str.replace(charToReplace, replacingChar);
 */