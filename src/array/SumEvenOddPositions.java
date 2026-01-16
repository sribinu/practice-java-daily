package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR23
 * Question     : Find sum of elements at even and odd positions.
 * Title        : SumEvenOddPositions.java
 * Author       : Sribinu P
 * Created On   : 15-01-2026
 * Topic        : Array (SumEvenOddPositions)
 * Difficulty   : Easy
 * Description  : This program reads N elements into an array and calculates the sum of elements at even positions and odd positions separately.
 * ----------------------------------------------------------
 */

public class SumEvenOddPositions {

    public static void main(String[] args) {
        // Program ARR23: SumEvenOddPositions
        // Use the index (i % 2), not the value, to decide even or odd position.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int evenSum = 0, oddSum = 0;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();

            if (i % 2 == 0)
                evenSum += arr[i];
            else
                oddSum += arr[i];
        }

        System.out.println("Sum of elements at even positions: " + evenSum);
        System.out.println("Sum of elements at odd positions : " + oddSum);


        scan.close();
    }
}

/* Output:

 */