package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR25
 * Question     : Find missing number in a sequence 1 to N.
 * Title        : MissingNumber.java
 * Author       : Sribinu P
 * Created On   : 17-01-2026
 * Topic        : Array (Missing Number)
 * Difficulty   : Easy
 * Description  : This program finds the missing number in a sequence containing
 *                numbers from 1 to N, where one number is missing, using the sum formula approach.
 * ----------------------------------------------------------
 */

public class MissingNumber {

    public static void main(String[] args) {
        // Program ARR25: MissingNumber
        // Subtract the sum of array elements from the expected sum of 1 to N. Expected sum = N × (N + 1) / 2
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = scan.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements:");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - sum;

        System.out.println("Missing number is: " + missing);
        scan.close();
    }
}

/* Output:
    Enter value of N: 5
    Enter 4 elements:
    1
    2
    4
    5
    Missing number is: 3
 */