package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR15
 * Question     : Find duplicate elements in an array.
 * Title        : DuplicateElements.java
 * Author       : Sribinu P
 * Created On   : 08-01-2026
 * Topic        : Array (Duplicate Elements)
 * Difficulty   : Easy
 * Description  : This program identifies and prints all elements that appear more than once in an array.
 * ----------------------------------------------------------
 */

public class DuplicateElements {

    public static void main(String[] args) {
        // Program ARR15: DuplicateElements
        // Compare each element with remaining elements.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size N: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Duplicate elements: ");
        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Avoid printing same duplicate again
            if (isDuplicate) {
                boolean printed = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        printed = true;
                        break;
                    }
                }

                if (!printed) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
        }

        if (!found)
            System.out.print("None");

        scan.close();
    }
}

/* Output:
    Enter size N: 5
    Enter array elements:
    1
    2
    1
    2
    3
    Array after removing duplicates: 1 2 3
 */