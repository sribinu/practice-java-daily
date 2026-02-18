package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR21
 * Question     : Check if one string is a substring of another.
 * Title        : SubstringCheck.java
 * Author       : Sribinu P
 * Created On   : 17-02-2026
 * Topic        : String (Substring Check)
 * Difficulty   : Easy
 * Description  : This program checks whether one string (small string) exists inside another string (main string).
 * ----------------------------------------------------------
 */

public class SubstringCheck {

    public static void main(String[] args) {
        // Program STR21: SubstringCheck
        // Fix starting point (i), compare character-by-character (j). If all match → substring found.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = scan.nextLine();

        System.out.print("Enter substring: ");
        String subStr = scan.nextLine();

        boolean found = false;

        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) {

            int j;
            for (j = 0; j < subStr.length(); j++) {
                if (mainStr.charAt(i + j) != subStr.charAt(j)) {
                    break;
                }
            }

            if (j == subStr.length()) {
                found = true;
                break;
            }
        }

        if (mainStr.contains(subStr)) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }

        scan.close();
    }
}

/* Output:
    Enter main string: java programming
    Enter substring: java
    Substring found
 */

/* Another Logic: // using built-in methods contains() or indexOf()
        if (mainStr.contains(subStr)) { // if (mainStr.indexOf(subStr) != -1)
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }
 */