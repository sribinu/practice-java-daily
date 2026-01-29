package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR1
 * Question     : Read a string and display it.
 * Title        : ReadAndDisplay.java
 * Author       : Sribinu P
 * Created On   : 28-01-2026
 * Topic        : String (Read & Display)
 * Difficulty   : Easy
 * Description  : This program reads a string from the user and displays the same string on the screen.
 * ----------------------------------------------------------
 */

public class ReadAndDisplay {

    public static void main(String[] args) {
        // Program STR1: ReadAndDisplay
        // Use Scanner.nextLine() to read a full string including spaces
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scan.nextLine();

        System.out.println("You entered: " + str);
        scan.close();
    }
}

/* Output:
    Enter a string:
    Java Development
    You entered: Java Development
 */