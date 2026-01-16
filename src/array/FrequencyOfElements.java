package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR21
 * Question     : Count frequency of each element in the array.
 * Title        : FrequencyOfElements.java
 * Author       : Sribinu P
 * Created On   : 14-01-2026
 * Topic        : Array (Count Frequency of Elements)
 * Difficulty   : Medium
 * Description  : This program counts how many times each element appears in an array and prints the frequency.
 * ----------------------------------------------------------
 */

public class FrequencyOfElements {

    public static void main(String[] args) {
        // Program ARR21: FrequencyOfElements
        // For each element, compare it with all other elements and count matches, while skipping already counted values.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("\nElement : Frequency");

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " : " + count);
        }

        scan.close();
    }
}

/* Output:
    Enter array size: 7
    Enter array elements:
    1
    2
    3
    1
    2
    4
    5

    Element : Frequency
    1 : 2
    2 : 2
    3 : 1
    4 : 1
    5 : 1
 */