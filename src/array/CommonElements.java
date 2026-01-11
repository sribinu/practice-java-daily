package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR18
 * Question     : Find common elements between two arrays.
 * Title        : CommonElements.java
 * Author       : Sribinu P
 * Created On   : 10-01-2026
 * Topic        : Array (Common Elements)
 * Difficulty   : Easy
 * Description  : This program finds and prints the common elements present in both arrays by comparing each element of the first array with every element of the second array.
 * ----------------------------------------------------------
 */

public class CommonElements {

    public static void main(String[] args) {
        // Program ARR1: CommonElements
        // Compare each element of first array with all elements of second array.
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

        System.out.print("Common Elements: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break; // avoid duplicate
                }
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
    2
    3
    4
    2
    3
    Common Elements: 2 3 4
 */