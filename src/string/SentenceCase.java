package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR36
 * Question     : Convert sentence to sentence case.
 * Title        : SentenceCase.java
 * Author       : Sribinu P
 * Created On   : 05-03-2026
 * Topic        : String (Sentence Case)
 * Difficulty   : Intermediate
 * Description  : In Sentence Case, only the first letter of the entire sentence is capitalized.
 * ----------------------------------------------------------
 */

public class SentenceCase {

    public static void main(String[] args) {
        // Program STR36: SentenceCase
        // Use a flag (capitalizeNext) → capitalize when true → set it again after . ! ?.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = scan.nextLine().toLowerCase();

        String result = "";
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (capitalizeNext && Character.isLetter(ch)) {
                result += Character.toUpperCase(ch);
                capitalizeNext = false;
            } else {
                result += ch;
            }

            // detect sentence ending
            if (ch == '.' || ch == '!' || ch == '?') {
                capitalizeNext = true;
            }
        }

        System.out.println("Formatted text: " + result);
        System.out.println();

        scan.close();
    }
}

/* Output:
    Enter text: hello java. java is powerful! java is secured
    Formatted text: Hello java. Java is powerful! Java is secured
 */