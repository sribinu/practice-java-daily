package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR13
 * Question     : Search an element in an array using linear search.
 * Title        : LinearSearch.java
 * Author       : Sribinu P
 * Created On   : 07-01-2026
 * Topic        : Array (Linear Search)
 * Difficulty   : Easy
 * Description  : This is a program to search an element in an array using linear search.
 * ----------------------------------------------------------
 */

public class LinearSearch {

    public static void main(String[] args) {
        // Program ARR13: LinearSearch
        // Scan one by one until match or end
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter element to search: ");
        int key = scan.nextInt();

        int pos = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
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
    Enter no of elements: 5
    Enter 5 elements:
    3
    5
    6
    7
    8
    Enter element to search:
    7
    Element found at index: 3
 */