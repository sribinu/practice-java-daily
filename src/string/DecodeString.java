package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR38
 * Question     : Reverse of encode — shift characters back.
 * Title        : DecodeString.java
 * Author       : Sribinu P
 * Created On   : 07-03-2026
 * Topic        : String (Encode)
 * Difficulty   : Easy
 * Description  : Reverse the encoding by shifting each character back by one ASCII value.
 * ----------------------------------------------------------
 */

public class DecodeString {

    public static void main(String[] args) {
        // Program STR38: DecodeString
        // Previous character = (char)(currentChar - 1)
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += (char) (str.charAt(i) - 1);
        }

        System.out.println("Encode string: " + result);

        scan.close();
    }
}

/* Output:
    Enter a string: kbwb!qsphsbnnnjoh
    Encode string: java programmming
 */