package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR5
 * Question     : Count number of vowels and consonants in a string.
 * Title        : VowelConsonantCount.java
 * Author       : Sribinu P
 * Created On   : 01-02-2026
 * Topic        : String (Vowel & Consonant count)
 * Difficulty   : Easy
 * Description  : This program counts the number of vowels and consonants in a given string.
 *                Only alphabetic characters are considered.
 * ----------------------------------------------------------
 */

public class VowelConsonantCount {

    public static void main(String[] args) {
        // Program STR5: VowelConsonantCount
        // Check each character: if it’s a vowel → vowel count, else alphabet → consonant count.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowel count: " + vowels);
        System.out.println("Consonant count: " + consonants);
        scan.close();
    }
}

/* Output:
    Enter a string: Java Programming
    Vowel count: 5
    Consonant count: 10
 */