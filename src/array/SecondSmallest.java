package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR6
 * Question     : Find the second smallest element without sorting.
 * Title        : SecondSmallest.java
 * Author       : Sribinu P
 * Created On   : 03-01-2026
 * Topic        : Array (Second Smallest)
 * Difficulty   : Easy
 * Description  :
 * ----------------------------------------------------------
 */

public class SecondSmallest {

    public static void main(String[] args) {
        // Program ARR6: SecondSmallest

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second smallest element (all values same).");
        } else {
            System.out.println("Second smallest element = " + secondMin);
        }
        scan.close();
    }
}

/* Output:
    Enter no of elements: 5
    Enter 5 elements:
    21
    43
    45
    65
    76
    Second smallest element = 43
 */