package string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * ----------------------------------------------------------
 * Program No   : STR32
 * Question     : PangramCheck
 * Title        : PangramCheck.java
 * Author       : Sribinu P
 * Created On   : 01-03-2026
 * Topic        : String (Pangram)
 * Difficulty   : Intermediate
 * Description  : A pangram is a sentence that contains all 26 English alphabets at least once.
 * ----------------------------------------------------------
 */

public class PangramCheck {

    public static void main(String[] args) {
        // Program STR32: PangramCheck
        // Track letters a–z → If count = 26 → Pangram.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();

        boolean[] letters = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;

            }
        }

        boolean isPangram = true;

        for (boolean b : letters) {
            if (!b) {
                isPangram = false;
                break;
            }
        }

        if (isPangram) {
            System.out.println("It is a Pangram");
        } else {
            System.out.println("It is not a Pangram");
        }

        scan.close();
    }
}

/* Output:
    Enter a string: The quick brown fox jumps over the lazy dog
    It is a Pangram
 */

/* Another Logic: // Using HashSet
        Set<Character> set = new HashSet<>();

        for (char ch :  str.toCharArray()) {
            if (Character.isLetter(ch)) {
                set.add(Character.toLowerCase(ch));
            }
        }

        if (set.size() == 26) {
            System.out.println("It is a Pangram");
        } else {
            System.out.println("It is not a Pangram");
        }
 */