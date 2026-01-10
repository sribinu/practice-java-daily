package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR15
 * Question     : Merge two arrays into a single array.
 * Title        : MergeTwoArrays.java
 * Author       : Sribinu P
 * Created On   : 10-01-2026
 * Topic        : Array (Merge Two Array)
 * Difficulty   : Easy
 * Description  : This program reads two arrays and merges them into one single array by copying elements one after another.
 * ----------------------------------------------------------
 */

public class MergeTwoArrays {

    public static void main(String[] args) {
        // Program ARR15: MergeTwoArrays
        // Copy first array elements, then second array elements
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = scan.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = scan.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] merged = new int[n1 + n2];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }

        int index = 0;

        for (int i = 0; i < n1; i++) {
            merged[index++] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            merged[index++] = arr2[i];
        }

        System.out.println("Merged Array: ");
        for (int a : merged) {
            System.out.print(a + " ");
        }
    }
}

/* Output:
    Enter size of first array: 3
    Enter size of second array: 4
    Enter first array elements:
    1
    2
    3
    Enter second array elements:
    4
    5
    5
    6
    Merged Array:
    1 2 3 4 5 5 6
 */