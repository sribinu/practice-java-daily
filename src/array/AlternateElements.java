package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR22
 * Question     : Print alternate elements of an array.
 * Title        : AlternateElements.java
 * Author       : Sribinu P
 * Created On   : 12-01-2025
 * Topic        : Array (Rotate Array)
 * Difficulty   : Easy
 * Description  : This program prints every alternate element of an array starting from the first element (index 0).
 * ----------------------------------------------------------
 */

public class AlternateElements {

    public static void main(String[] args) {
        // Program ARR22: AlternateElements

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Alternate elements: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}

/* Output:
    Enter array size: 6
    Enter array elements:
    1
    2
    3
    4
    5
    6
    Alternate elements: 1 3 5
 */