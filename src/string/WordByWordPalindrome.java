package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR40
 * Question     : Check if entire sentence is palindrome word by word.
 * Title        : WordByWordPalindrome.java
 * Author       : Sribinu P
 * Created On   : 09-03-2026
 * Topic        : String (Palindrome Word By Word)
 * Difficulty   : Easy
 * Description  : Check if a sentence is palindrome word by word.
 * ----------------------------------------------------------
 */

public class WordByWordPalindrome {

    public static void main(String[] args) {
        // Program STR40: WordByWordPalindrome
        // Split sentence → check palindrome for each word
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine().toLowerCase();

        String[] words = sentence.split("\\s+");

        boolean allPalindrome = true;

        for (String word : words) {

            String reversed = new StringBuilder(word).reverse().toString();

            if (!word.equals(reversed)) {
                allPalindrome = false;
                break;
            }
        }

        if (allPalindrome)
            System.out.println("Sentence is palindrome word by word");
        else
            System.out.println("Not palindrome word by word");

        scan.close();
    }
}

/* Output:
    Enter a sentence:  level noon
    Sentence is palindrome word by word
 */