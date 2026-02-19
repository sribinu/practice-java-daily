package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR22
 * Question     : Check if one string is a rotation of another.
 * Title        : StringRotation.java
 * Author       : Sribinu P
 * Created On   : 18-02-2026
 * Topic        : String (Rotation)
 * Difficulty   : Medium
 * Description  : Two strings are rotations if: One string can be obtained by rotating the other.
 * ----------------------------------------------------------
 */

public class StringRotation {

    public static void main(String[] args) {
        // Program STR22: StringRotation
        // If lengths equal and s2 is substring of (s1 + s1), then rotation exists.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = scan.nextLine();

        System.out.print("Enter substring: ");
        String subStr = scan.nextLine();

        String doubled = mainStr + mainStr;

        boolean found = false;

        for (int i = 0; i <= doubled.length() - subStr.length(); i++) {

            int j;
            for (j = 0; j < subStr.length(); j++) {
                if (doubled.charAt(i + j) != subStr.charAt(j)) {
                    break;
                }
            }

            if (j == subStr.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Rotation found");
        } else {
            System.out.println("Rotation not found");
        }

        scan.close();
    }
}

/* Output:
    Enter main string: java
    Enter substring: avaj
    Rotation found
 */

/* Another Logic:
        if (mainStr.length() == subStr.length() && doubled.contains(mainStr)) {
            System.out.println("Rotation found");
        } else {
            System.out.println("Rotation not found");
        }
 */