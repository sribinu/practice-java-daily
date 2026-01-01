package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR3
 * Question     : Find largest and smallest element in an array.
 * Title        : ArrayMinMax.java
 * Author       : Sribinu P
 * Created On   : 01-01-2026
 * Topic        : Array (Min & Max Values)
 * Difficulty   : Easy
 * Description  : This program finds the largest and smallest elements present in an array.
 * ----------------------------------------------------------
 */

public class ArrayMinMax {

    public static void main(String[] args) {
        // Program ARR3: ArrayMinMax
        // Start with arr[0] → compare → update min & max
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Largest element = " + max);
        System.out.println("Smallest element = " + min);
        scan.close();
    }
}

/* Output:
    Enter no of elements: 5
    Enter 5 elements:
    2
    43
    566
    74
    6
    Largest number = 566
    Smallest number = 2
 */