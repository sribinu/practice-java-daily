package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR9
 * Question     : Remove all vowels from a string.
 * Title        : RemoveVowels.java
 * Author       : Sribinu P
 * Created On   : 05-02-2026
 * Topic        : String (Remove Vowels)
 * Difficulty   : Easy
 * Description  : This program removes all vowels (a, e, i, o, u) from a given string and prints the resulting string.
 * ----------------------------------------------------------
 */

public class RemoveVowels {

    public static void main(String[] args) {
        // Program STR9: RemoveVowels
        // Convert character to lowercase before vowel comparison to handle both cases.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                result += str.charAt(i);
            }
        }

        System.out.println("String after removing vowels: " + result);
        scan.close();
    }
}

/* Output:
    Enter a string: Java Programming
    String after removing vowels: Jv Prgrmmng
 */

/* Another Logic:
    String result = str.replaceAll("[aeiouAEIOU]", "");
 */