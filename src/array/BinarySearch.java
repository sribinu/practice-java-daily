package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR14
 * Question     : Perform binary search on a sorted array.
 * Title        : BinarySearch.java
 * Author       : Sribinu P
 * Created On   : 07-01-2026
 * Topic        : Binary Search
 * Difficulty   : Easy
 * Description  : This is a program to search an element in an array using binary search.
 * ----------------------------------------------------------
 */

public class BinarySearch {

    public static void main(String[] args) {
        // Program ARR14: BinarySearch
        // Repeatedly divide search space into half.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size N: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = scan.nextInt();

        int low = 0, high = n - 1;
        int pos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (pos != -1)
            System.out.println("Element found at index: " + pos);
        else
            System.out.println("Element not found");

        scan.close();
    }
}

/* Output:
    Enter array size N: 5
    Enter sorted array elements:
    2
    4
    6
    8
    9
    Enter element to search: 6
    Element found at index: 2
 */