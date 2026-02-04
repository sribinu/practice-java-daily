package string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR7
 * Question     : Find frequency of each character in string.
 * Title        : CharacterFrequency.java
 * Author       : Sribinu P
 * Created On   : 03-02-2026
 * Topic        : String (Frequency of characters)
 * Difficulty   : Medium
 * Description  : This program counts how many times each character appears in a given string.
 * ----------------------------------------------------------
 */

public class CharacterFrequency {

    public static void main(String[] args) {
        // Program STR7: CharacterFrequency
        // Use LinkedHashMap to count characters while preserving their first-appearance order.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();
        char[] chars = str.toCharArray();

        Map<Character, Integer> result = new LinkedHashMap<>();
        for (char c : chars) {
            if (c == ' ')
                continue;

            if (result.containsKey(c)) {
                int count = result.get(c);
                result.put(c, count + 1);
            } else {
                result.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> v : result.entrySet()) {
            System.out.println(v.getKey() + " : " + v.getValue());
        }

        scan.close();
    }
}

/* Output:
    Enter a string: java programming
    j : 1
    a : 3
    v : 1
    p : 1
    r : 2
    o : 1
    g : 2
    m : 2
    i : 1
    n : 1
 */

/* Another Logic:
        String str = scan.nextLine().toLowerCase();
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            if ((chars[i] == 0) || (chars[i] == ' '))
                continue;

            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = 0;
                }
            }

            System.out.println(chars[i] + " : " + count);
        }
 */