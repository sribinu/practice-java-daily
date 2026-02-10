package string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR13
 * Question     : Check if two strings are anagrams.
 * Title        : Anagram.java
 * Author       : Sribinu P
 * Created On   : 09-02-2026
 * Topic        : String (Anagram)
 * Difficulty   : Medium
 * Description  : Two strings are anagrams if they: Contain the same characters, Have the same frequency, Order does not matter.
 * ----------------------------------------------------------
 */

public class Anagram {

    public static void main(String[] args) {
        // Program STR13: Anagram
        // Two strings are anagrams if their sorted characters are identical.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (Arrays.equals(chars1, chars2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        scan.close();
    }
}

/* Output:
    Enter the first string: Listen
    Enter the second string: Silent
    Anagrams
 */