package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR45
 * Question     : Find all the permutations of a string.
 * Title        : StringPermutation.java
 * Author       : Sribinu P
 * Created On   : 15-03-2026
 * Topic        : String (Permutation)
 * Difficulty   : Intermediate
 * Description  : Find all permutations of a string.
 *                Permutation means all possible arrangements of characters.
 * ----------------------------------------------------------
 */

public class StringPermutation {

    public static void main(String[] args) {
        // Program STR45: StringPermutation
        // Fix one character → recursively permute the remaining characters.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = scan.nextLine();

        permute(str, "");

        scan.close();
    }
    public static void permute(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            String remaining =
                    str.substring(0, i) + str.substring(i + 1);

            permute(remaining, result + current);
        }
    }
}

/* Output:
    Enter string: ABC
    ABC
    ACB
    BAC
    BCA
    CAB
    CBA
 */