package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR10
 * Question     : Convert lowercase to uppercase and vice versa.
 * Title        : ToggleCase.java
 * Author       : Sribinu P
 * Created On   : 06-02-2026
 * Topic        : String (Toggle Case)
 * Difficulty   : Medium
 * Description  : This program toggles the case of each alphabet in a given string.
 * ----------------------------------------------------------
 */

public class ToggleCase {

    public static void main(String[] args) {
        // Program STR10: ToggleCase
        // Check character case and append its opposite case while leaving non-letters unchanged.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else
                result += ch;
        }

        System.out.println("String after toggling case: " + result);
        scan.close();
    }
}

/* Output:
    Enter the string: Java Program
    String after toggling case: jAVA pROGRAM
 */

/* Another Logic: // Difference between uppercase and lowercase letters in ASCII is 32.
    String str = scan.nextLine();
    String result = "";

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch >= 'A' && ch <= 'Z') {
            result += (char) (ch + 32); // lowercase to uppercase (ASCII)
        } else if (ch >= 'a' && ch <= 'z') {
            result += (char) (ch - 32); // uppercase to lowercase
        } else {
            result += ch;
        }
    }
 */