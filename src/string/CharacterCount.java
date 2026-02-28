package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR31
 * Question     : Count how many times a specific character occurs.
 * Title        : CharacterCount.java
 * Author       : Sribinu P
 * Created On   : 28-02-2026
 * Topic        : String (Character Count)
 * Difficulty   : Easy
 * Description  : Given a string and a character, count how many times that character appears.
 * ----------------------------------------------------------
 */

public class CharacterCount {

    public static void main(String[] args) {
        // Program STR31: CharacterCount
        // Loop through string → Compare each character → Increment counter.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        System.out.print("Enter the character to count: ");
        char ch = scan.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("Character '" + ch + "' occurs " + count + " times");

        scan.close();
    }
}

/* Output:
    Enter a string: java is a programming language
    Enter the character to count: a
    Character 'a' occurs 6 times
 */