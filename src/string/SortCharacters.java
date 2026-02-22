package string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR25
 * Question     : Sort characters of a string alphabetically.
 * Title        : SortCharacters.java
 * Author       : Sribinu P
 * Created On   : 22-02-2026
 * Topic        : String (Sort Characters)
 * Difficulty   : Easy
 * Description  : Arrange all characters of a string in alphabetical order.
 * ----------------------------------------------------------
 */

public class SortCharacters {

    public static void main(String[] args) {
        // Program STR25: SortCharacters
        // Convert string to char array → sort → convert back to string.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        char[] chars = str.toCharArray();

        Arrays.sort(chars);

//        for (char ch : chars) {
//            System.out.print(ch);
//        }
        System.out.println(new String(chars));

        scan.close();
    }
}

/* Output:
    Enter a string: programming
    aggimmnoprr
 */

/* Another Logic: // Manual Bubble Sort
    char[] chars = str.toCharArray();

    for (int i = 0; i < chars.length - 1; i++) {
        for (int j = 0; j < chars.length - i - 1; j++) {
            if (chars[j] > chars[j + 1]) {
                char temp = chars[j];
                chars[j] = chars[j + 1];
                chars[j + 1] = temp;
            }
        }
    }

    System.out.println(new String(chars));
 */