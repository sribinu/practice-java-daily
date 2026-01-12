package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR19
 * Question     : Find union of two arrays.
 * Title        : UnionOfArrays.java
 * Author       : Sribinu P
 * Created On   : 11-01-2026
 * Topic        : Array (Union of Arrays)
 * Difficulty   : Medium
 * Description  : This program finds the union of two arrays, i.e., it prints all unique elements present in either or both arrays, without duplicates.
 * ----------------------------------------------------------
 */

public class UnionOfArrays {

    public static void main(String[] args) {
        // Program ARR19: UnionOfArrays
        // Print all elements of first array, then print only non-duplicate elements from second array.
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = scan.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = scan.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        System.out.println("Enter first array elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter second array elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }

        System.out.print("Union Elements: ");
        for (int a : arr1) {
            System.out.print(a + " ");
        }

        for (int i = 0; i < n2; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < n1; j++) {
                if (arr2[i] == arr1[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr2[i] + " ");
            }
        }

        scan.close();
    }
}

/* Output:
    Enter size of first array: 5
    Enter size of second array: 5
    Enter first array elements:
    1
    2
    3
    4
    5
    Enter second array elements:
    6
    7
    1
    2
    3
    Union Elements: 1 2 3 4 5 6 7
 */