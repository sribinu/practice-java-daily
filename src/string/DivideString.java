package string;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : STR48
 * Question     : Divide a string in 'N' equal parts.
 * Title        : DivideString.java
 * Author       : Sribinu P
 * Created On   : 18-03-2026
 * Topic        : String (Divide)
 * Difficulty   : Easy
 * Description  : Divide a string into N equal parts.
 * ----------------------------------------------------------
 */

public class DivideString {

    public static void main(String[] args) {
        // Program STR48: DivideString
        // If length % n == 0 → split using part size = length / n
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        System.out.print("Enter number of parts: ");
        int n = scan.nextInt();

        int length = str.length();

        if (length % n != 0) {
            System.out.println("Cannot divide string into equal parts");
        } else {
            int partSize = length / n;

            for (int i = 0; i < length; i += partSize) {
                System.out.println(str.substring(i, i + partSize));
            }
        }

        scan.close();
    }
}

/* Output:
    Enter a string: quantitative aptitude
    Enter number of parts: 3
    quantit
    ative a
    ptitude
 */