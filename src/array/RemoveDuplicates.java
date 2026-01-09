package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR16
 * Question     : Remove duplicate elements from an array.
 * Title        : RemoveDuplicates.java
 * Author       : Sribinu P
 * Created On   : 09-01-2026
 * Topic        : Array (Remove duplicates)
 * Difficulty   : Medium
 * Description  : This program removes duplicate elements from an array and prints only unique values.
 * ----------------------------------------------------------
 */

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Program ARR17: RemoveDuplicates
        // Copy element only if it is not already present.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int[] unique = new int[n]; // temporary array
        int count = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                unique[count++] = arr[i];
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }

        scan.close();

    }
}

/* Output:
    Enter size N: 5
    Enter array elements:
    2
    2
    3
    3
    4
    Array after removing duplicates: 2 3 4
 */