package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR28
 * Question     : Find duplicate words in a sentence.
 * Title        : DuplicateWords.java
 * Author       : Sribinu P
 * Created On   : 25-02-2026
 * Topic        : String (Duplicate Words)
 * Difficulty   : Easy
 * Description  : Print words that appear more than once in a sentence.
 * ----------------------------------------------------------
 */

public class DuplicateWords {

    public static void main(String[] args) {
        // Program STR28: DuplicateWords
        // Split → Store word counts in Map → Print count > 1.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine().toLowerCase();

        String[] words = str.split("\\s+");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        System.out.println("Duplicate words: ");

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }

        scan.close();
    }
}

/* Output:
    Enter a string: java is great and java is powerful
    Duplicate words:
    java : 2
    is : 2
 */