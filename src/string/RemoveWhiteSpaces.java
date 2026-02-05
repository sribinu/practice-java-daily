package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR8
 * Question     : Remove all white spaces from a string.
 * Title        : RemoveWhiteSpaces.java
 * Author       : Sribinu P
 * Created On   : 05-02-2026
 * Topic        : String (Remove white spaces)
 * Difficulty   : Easy
 * Description  : This program removes all white spaces from a given string and prints the cleaned string.
 * ----------------------------------------------------------
 */

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        // Program STR8: RemoveWhiteSpaces
        // Traverse the string and append only non-space characters to remove spaces manually.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println("String after removing white spaces: " + result);
        scan.close();
    }
}

/* Output:
    Enter a string: java    is a programming   language
    String after removing white spaces: javaisaprogramminglanguage
 */

/* Another Logic:
    String result = str.replaceAll("\\s", "");
 */