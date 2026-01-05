package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR8
 * Question     : Count positive, negative, and zero elements in an array.
 * Title        : CountPosNegZero.java
 * Author       : Sribinu P
 * Created On   : 05-01-2026
 * Topic        : Array (Count Positive, Negative &  Zero Elements)
 * Difficulty   : Easy
 * Description  : This program reads N integers into an array and counts how many elements are positive, negative, and zero.
 * ----------------------------------------------------------
 */

public class CountPosNegZero {

    public static void main(String[] args) {
        // Program ARR8: CountPosNegZero
        // Traverse the array once and classify each element using comparison operators (> 0, < 0, == 0).
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int positive = 0, negative = 0, zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative++;
            } else if (arr[i] > 0) {
                positive++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive count = " + positive);
        System.out.println("Negative count = " + negative);
        System.out.println("Zero count     = " + zero);
        scan.close();
    }
}

/* Output:
    Enter no of elements: 5
    Enter 5 elements:
    34
    -43
    -4
    0
    0
    Positive count = 1
    Negative count = 2
    Zero count     = 2
 */