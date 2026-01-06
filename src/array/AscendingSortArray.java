package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR11
 * Question     : Sort array in ascending order (manually using loop).
 * Title        : AscendingSortArray.java
 * Author       : Sribinu P
 * Created On   : 06-01-2026
 * Topic        : Array (Sort - Ascending)
 * Difficulty   : Medium
 * Description  : This program sorts the elements of an array in ascending order without using built-in sorting methods, by comparing and swapping elements using loops.
 * ----------------------------------------------------------
 */

public class AscendingSortArray {

    public static void main(String[] args) {
        // Program ARR11: AscendingSortArray
        // Compare each element with the remaining elements and swap whenever a smaller value is found. If current > next → swap
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array Elements: ");
        for (int c : arr) {
            System.out.print(c + " ");
        }
        scan.close();
    }
}

/* Output:
    Enter no of elements: 5
    Enter 5 elements:
    5
    4
    3
    2
    7
    Sorted Array Elements: 2 3 4 5 7
 */