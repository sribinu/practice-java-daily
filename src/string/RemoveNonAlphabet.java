package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR34
 * Question     : Remove all non-alphabet characters.
 * Title        : RemoveNonAlphabet.java
 * Author       : Sribinu P
 * Created On   : 03-03-2026
 * Topic        : String (Remove Non-Alphabets)
 * Difficulty   : Intermediate
 * Description  : Remove everything except letters (a–z, A–Z).
 * ----------------------------------------------------------
 */

public class RemoveNonAlphabet {

    public static void main(String[] args) {
        // Program STR34: RemoveNonAlphabet
        // Keep only characters between 'a–z' or 'A–Z'.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                result += ch;
            }
        }

        System.out.println("Updated string: " + result);

        scan.close();
    }
}

/* Output:
    Enter a string: Java #Programming!
    Updated string: JavaProgramming
 */