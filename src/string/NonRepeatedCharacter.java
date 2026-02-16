package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR19
 * Question     : Find first non-repeated character in a string.
 * Title        : NonRepeatedCharacter.java
 * Author       : Sribinu P
 * Created On   : 15-02-2026
 * Topic        : String (Non-Repeated Character)
 * Difficulty   : Medium
 * Description  : This program finds the first character that appears only once in a string.
 * ----------------------------------------------------------
 */

public class NonRepeatedCharacter {

    public static void main(String[] args) {
        // Program STR19: NonRepeatedCharacter
        // Count frequencies first, then find the first character with count = 1.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        Map<Character, Integer> values = new LinkedHashMap<>();

        for (char ch: str.toCharArray()) {
            if (ch == ' ')
                continue;

            if (values.containsKey(ch)) {
                values.put(ch, values.get(ch) + 1);
            } else {
                values.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> c : values.entrySet()) {
            if (c.getValue() == 1) {
                System.out.println("First non-repeated character: " + c.getKey());
                break;
            }
        }

        scan.close();
    }
}

/* Output:
    Enter a string: programming
    First non-repeated character: p
 */

/* Another Logic: // Check every character against all others to confirm uniqueness.
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                System.out.println("First non-repeated character: " + str.charAt(i));
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("No non-repeated character found");
 */