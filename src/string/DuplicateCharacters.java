package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR14
 * Question     : Find duplicate characters in a string.
 * Title        : DuplicateCharacters.java
 * Author       : Sribinu P
 * Created On   : 10-02-2026
 * Topic        : String (Duplicate Characters)
 * Difficulty   : Medium
 * Description  : This program finds and prints duplicate characters in a given string along with their frequency.
 *                Spaces are ignored and characters are treated case-insensitively.
 * ----------------------------------------------------------
 */

public class DuplicateCharacters {

    public static void main(String[] args) {
        // Program STR14: DuplicateCharacters
        // Use a map to count character frequency and print entries with count > 1.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();

        Map<Character, Integer> result = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch == ' ')
                continue;

            if (result.containsKey(ch)) {
                int count = result.get(ch);
                result.put(ch, count + 1);
            } else {
                result.put(ch, 1);
            }
        }

        System.out.println("Duplicate characters: ");
        for (Map.Entry<Character, Integer> v : result.entrySet()) {
            if (v.getValue() > 1) {
                System.out.println(v.getKey() + " : " + v.getValue());
            }
        }

        scan.close();
    }
}

/* Output:
    Enter a string: Java Programming
    Duplicate characters:
    a : 3
    r : 2
    g : 2
    m : 2
 */

/* Another Logic: // Array based
    int[] freq = new int[256];

    for (char ch : str.toCharArray()) {
        if (ch != ' ')
            freq[ch]++;
    }

    for (int i = 0; i < freq.length; i++) {
        if (freq[i] > 1)
            System.out.println((char)i + " : " + freq[i]);
    }
 */