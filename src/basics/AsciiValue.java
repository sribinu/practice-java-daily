package basics;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : B8
 * Question     : Print ASCII value of a given character.
 * Title        : AsciiValue.java
 * Author       : Sribinu P
 * Created On   : 19-11-2025
 * Topic        : ASCII Value
 * Difficulty   : Easy
 * Description  : char to int change
 * ----------------------------------------------------------
 */

public class AsciiValue {

    public static void main(String[] args) {
        // Program B8: AsciiValue
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char value = scan.next().charAt(0);

        int ascii = value; // Automatic Conversion
        System.out.println("ASCII value of " + value + " is : " + ascii);

        scan.close();
    }
}

/* Output:
    Enter a character: a
    ASCII value of a is : 97
 */