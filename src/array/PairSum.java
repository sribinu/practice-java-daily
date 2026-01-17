package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR24
 * Question     : Find all pairs in array whose sum equals a given number.
 * Title        : PairSum.java
 * Author       : Sribinu P
 * Created On   : 16-01-2026
 * Topic        : Array (Pair Sum)
 * Difficulty   : Easy
 * Description  : This program reads N array elements and a target sum, then
 *                finds and prints all unique pairs of elements whose sum equals the given number using nested loops.
 * ----------------------------------------------------------
 */

public class PairSum  {

    public static void main(String[] args) {
        // Program ARR24: PairSum
        // Fix one element and check the remaining elements using a nested loop to find matching pairs.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter target sum: ");
        int sum = scan.nextInt();

        boolean found = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found with given sum.");
        }

        scan.close();
    }
}

/* Output:
    Enter size of array:
    5
    Enter array elements:
    1
    2
    3
    4
    5
    Enter target sum: 5
    Pair found: (1, 4)
    Pair found: (2, 3)
 */