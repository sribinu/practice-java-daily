package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR26
 * Question     : Swap first and last character of string.
 * Title        : SwapCharacters.java
 * Author       : Sribinu P
 * Created On   : 23-02-2026
 * Topic        : String (Swap Characters)
 * Difficulty   : Easy
 * Description  : Swap the first and last characters of a given string.
 * ----------------------------------------------------------
 */

public class SwapCharacters {

    public static void main(String[] args) {
        // Program STR26: SwapCharacters
        // Convert to char array → swap index 0 and last index.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        if (str.length() <= 1) {
            System.out.println("Result: " + str);
            scan.close();
            return;
        }

        char[] chars = str.toCharArray();

        char temp = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = temp;

        System.out.println("Result: " + new String(chars));

        scan.close();
    }
}

/* Output:
    Enter a string: program
    Result: mrograp
 */

/* Another Logic:
    String result = str.charAt(str.length() - 1) +
                    str.substring(1, str.length() - 1) +
                    str.charAt(0);
 */