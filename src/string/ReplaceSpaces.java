package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR50
 * Question     : Replace the spaces of a string with a specific character.
 * Title        : ReplaceSpaces.java
 * Author       : Sribinu P
 * Created On   : 20-03-2026
 * Topic        : String (Replace Space)
 * Difficulty   : Easy
 * Description  : Replace all spaces in a string with a given character.
 * ----------------------------------------------------------
 */

public class ReplaceSpaces {

    public static void main(String[] args) {
        // Program STR50: ReplaceSpaces
        // If char == space → replace with given character
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        System.out.print("Enter replacement character: ");
        char ch = scan.next().charAt(0);

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                result += ch;
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println("Modified string: " + result);

        scan.close();
    }
}

/* Output:
    Enter a string: java is a famous programming language
    Enter replacement character: -
    Modified string: java-is-a-famous-programming-language
 */