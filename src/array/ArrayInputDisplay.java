package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR1
 * Question     : Array Input & Display	Read N elements and print them.
 * Title        : array.ArrayInputDisplay.java
 * Author       : Sribinu P
 * Created On   : 30-12-2025
 * Topic        : Array (Input & Display)
 * Difficulty   : Easy
 * Description  : This program reads N elements into an array
 *                and prints them using loops.
 * ----------------------------------------------------------
 */

public class ArrayInputDisplay {

    public static void main(String[] args) {
        // Program ARR1: array.ArrayInputDisplay
        // Read N -> store in array -> print elements
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements are: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        scan.close();
    }
}

/* Output:
    Enter no of elements: 5
    Enter 5 elements:
    1
    2
    3
    4
    5
    Array elements are: 1 2 3 4 5
 */