package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR35
 * Question     : Find the third largest element in an array.
 * Title        : ThirdLargest.java
 * Author       : Sribinu P
 * Created On   : 27-01-2026
 * Topic        : Array (Third Largest)
 * Difficulty   : Medium
 * Description  : This program finds the third largest element in an array without sorting, using only a single traversal.
 * ----------------------------------------------------------
 */

public class ThirdLargest {

    public static void main(String[] args) {
        // Program ARR35: ThirdLargest
        // Track largest, second largest, and third largest while scanning the array.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scan.nextInt();

        if (n < 3) {
            System.out.println("At least 3 elements are required.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] != second && arr[i] != first) {
                third = arr[i];
            }
        }

        System.out.println("Third largest element = " + third);
        scan.close();
    }
}

/* Output:
    Enter number of elements: 5
    Enter array elements:
    1
    2
    3
    4
    5
    Third largest element = 3
 */