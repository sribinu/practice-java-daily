package array;

import java.util.Scanner;
import java.util.Arrays;

/**
 * ----------------------------------------------------------
 * Program No   : ARR5
 * Question     : Find second largest element using sorting
 * Title        : SecondLargestWithSort.java
 * Author       : Sribinu P
 * Created On   : 30-12-2025
 * Topic        : Arrays (Basic)
 * Difficulty   : Easy
 * Description  : This program finds the second largest element in an array using sorting.
 * ----------------------------------------------------------
 */

public class SortedSecondLargest {

    public static void main(String[] args) {
        // Program ARR5: SecondLargestWithSort
        // Workflow: Read N → sort → find second largest

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        if (n < 2) {
            System.out.println("Array must contain at least two elements.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        int largest = arr[n - 1];
        int secondLargest = -1;
        boolean found = false;

        // Step 2: Traverse from right to find second largest
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Second largest element = " + secondLargest);
        } else {
            System.out.println("No second largest element (all values same).");
        }

        scan.close();
    }
}


/* Output:

 */