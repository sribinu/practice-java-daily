package control_statements;

/**
 * ----------------------------------------------------------
 * Program No   : CS4
 * Question     : Check if a character is a vowel or consonant using if-else.
 * Title        : VowelOrConsonant.java
 * Author       : Sribinu P
 * Created On   : 22-11-2025
 * Topic        : Vowel or Consonant
 * Difficulty   : Very Easy
 * Description  : This program checks whether a given character is a vowel or a consonant.
 * ----------------------------------------------------------
 */

public class VowelOrConsonant {

    public static void main(String[] args) {
        // Program CS4: VowelOrConsonant
        // Converts character to lowercase and compares it with vowel list using if–else.
        char ch = 'A';
        char c = Character.toLowerCase(ch);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }
    }
}

/* Output:
    A is a Vowel
 */