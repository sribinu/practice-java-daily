package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR37
 * Question     : Replace each character with next ASCII character.
 * Title        : EncodeString.java
 * Author       : Sribinu P
 * Created On   : 06-03-2026
 * Topic        : String (Encode)
 * Difficulty   : Easy
 * Description  : Replace every character in a string with the next ASCII character.
 * ----------------------------------------------------------
 */

public class EncodeString {

    public static void main(String[] args) {
        // Program STR37: EncodeString
        // Next character = (char)(currentChar + 1)
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += (char) (str.charAt(i) + 1);
        }

        System.out.println("Encode string: " + result);

        scan.close();
    }
}

/* Output:
    Enter a string: java programmming
    Encode string: kbwb!qsphsbnnnjoh
 */