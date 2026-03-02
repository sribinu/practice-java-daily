package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR33
 * Question     : Count frequency of each letter ignoring case.
 * Title        : LetterFrequency.java
 * Author       : Sribinu P
 * Created On   : 02-03-2026
 * Topic        : String (Count Frequency)
 * Difficulty   : Intermediate
 * Description  : Count how many times each alphabet letter appears in a string.
 * ----------------------------------------------------------
 */

public class LetterFrequency {

    public static void main(String[] args) {
        // Program STR33: LetterFrequency
        // Convert to lowercase → Use array[26] → Increment using index (ch - 'a').
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();

        Map<Character, Integer> result = new HashMap<>();

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

        System.out.println("Letter frequencies: ");
        for (Map.Entry<Character, Integer> v : result.entrySet()) {
            System.out.println(v.getKey() + " : " + v.getValue());
        }

        scan.close();
    }
}

/* Output:
    Enter a string: Java Programming
    Letter frequencies:
    p : 1
    a : 3
    r : 2
    v : 1
    g : 2
    i : 1
    j : 1
    m : 2
    n : 1
    o : 1
 */

/* Another Logic: // Using integer array
        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        System.out.println("Letter frequencies:");

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " : " + freq[i]);
            }
        }
 */