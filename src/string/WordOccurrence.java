package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR23
 * Question     : Count how many times a word occurs in a sentence.
 * Title        : WordOccurrence.java
 * Author       : Sribinu P
 * Created On   : 19-02-2026
 * Topic        : String (Word Occurrence)
 * Difficulty   : Medium
 * Description  : Count how many times a given word appears in a sentence.
 * ----------------------------------------------------------
 */

public class WordOccurrence {

    public static void main(String[] args) {
        // Program STR23: WordOccurrence
        // Split the sentence into words and compare each word with the target.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        System.out.print("Enter word to count: ");
        String word = scan.nextLine();

        int count = 0;

        for (String w : str.split(" ")) {
            if (w.equals(word))
                count++;
        }

        System.out.println("Word count: " + count);

        scan.close();
    }
}

/* Output:
    Enter a string: java is powerful. java is safe. java is fast.
    Enter word to count: java
    Word count: 3
 */

/* Another Logic: // For counting each words
        String[] words = str.trim().split("\\s+");

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } else {
                map.put(w, 1);
            }
        }

        System.out.println("Word occurrences: ");
        for (Map.Entry<String, Integer> k : map.entrySet()) {
            System.out.println(k.getKey() + " : " + k.getValue());
        }
 */