package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR10
 * Question     : Copy elements of one array to another.
 * Title        : CopyArray.java
 * Author       : Sribinu P
 * Created On   : 06-01-2026
 * Topic        : Array (Copy)
 * Difficulty   : Easy
 * Description  : This program copies all elements from one array into another array of the same size.
 * ----------------------------------------------------------
 */

public class CopyArray {

    public static void main(String[] args) {
        // Program ARR10: CopyArray
        // Use a simple loop or System.arraycopy() to copy arrays safely and efficiently.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        // System.arraycopy(arr, 0, copy, 0, n); (Built-in Method)
        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
        }

        System.out.print("Copied Array Elements: ");
        for (int c : copy) {
            System.out.print(c + " ");
        }
        scan.close();
    }
}

/* Output:
    Enter no of elements: 4
    Enter 4 elements:
    1
    2
    3
    4
    Copied Array Elements: 1 2 3 4
 */