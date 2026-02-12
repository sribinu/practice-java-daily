package string;

import java.util.*;

/**
 * ----------------------------------------------------------
 * Program No   : STR15
 * Question     : Remove duplicate characters from a string.
 * Title        : RemoveDuplicates.java
 * Author       : Sribinu P
 * Created On   : 11-02-2026
 * Topic        : String (Remove Duplicates)
 * Difficulty   : Medium
 * Description  : This program removes duplicate characters from a string and keeps only the first occurrence of each character.
 * ----------------------------------------------------------
 */

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Program STR15: RemoveDuplicates
        // Store characters in a LinkedHashSet to remove duplicates while preserving order.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String result = "";
        Set<Character> chars = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            if (chars.add(ch)) { // add() returns false if already exists
                result += ch;
            }
        }

        System.out.println("Duplicates removed string: " + result);
        scan.close();
    }
}

/* Output:
    Enter a string: java programming
    Duplicates removed string: jav progmin
 */

/* Another Logic:
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
 */