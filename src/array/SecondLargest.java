package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR4
 * Question     : Find the second largest element without sorting.
 * Title        : SecondLargest.java
 * Author       : Sribinu P
 * Created On   : 01-01-2026
 * Topic        : Array (Second Largest)
 * Difficulty   : Easy
 * Description  : This program finds the second largest element in an array without sorting.
 * ----------------------------------------------------------
 */

public class SecondLargest {

    public static void main(String[] args) {
        // Program ARR4: SecondLargest
        // If current > max → shift max to secondMax
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element (all values same).");
        } else {
            System.out.println("Second largest element = " + secondMax);
        }
        scan.close();
    }
}

/* Output:
    Enter no of elements: 5
    Enter 5 elements:
    70
    60
    50
    40
    30
    Second largest element = 60
 */