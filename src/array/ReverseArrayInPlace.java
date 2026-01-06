package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR9
 * Question     : Reverse array elements without using another array.
 * Title        : ReverseArrayInPlace.java
 * Author       : Sribinu P
 * Created On   : 06-01-2026
 * Topic        : Array (Reverse an Array)
 * Difficulty   : Medium
 * Description  : This program reverses the elements of an array in-place, without using any extra array or memory.
 * ----------------------------------------------------------
 */

public class ReverseArrayInPlace {

    public static void main(String[] args) {
        // Program ARR9: ReverseArrayInPlace
        // Use two pointers (start and end) and swap until start < end to reverse
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int start = 0, end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("Array Elements in Reverse: ");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        scan.close();
    }
}

/* Output:
    Enter no of elements: 4
    Enter 4 elements:
    4
    3
    2
    1
    Array Elements in Reverse: 1 2 3 4
 */