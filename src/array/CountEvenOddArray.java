package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR7
 * Question     : Count how many even and odd elements are in the array.
 * Title        : CountEvenOddArray.java
 * Author       : Sribinu P
 * Created On   : 04-01-2026
 * Topic        : Array (Even & Odd Count)
 * Difficulty   : Easy
 * Description  : This program reads N integers into an array and counts how many elements are even and how many are odd.
 * ----------------------------------------------------------
 */

public class CountEvenOddArray {

    public static void main(String[] args) {
        // Program ARR6: CountEvenOddArray
        // Number % 2 == 0 → Even, Number % 2 == 1 → Odd
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else if (arr[i] % 2 == 1) {
                odd++;
            }
        }

        System.out.println("Even Count = " + even);
        System.out.println("Odd Count = " + odd);

        scan.close();
    }
}

/* Output:
    Enter no of elements: 5
    Enter 5 elements:
    23
    43
    45
    44
    22
    Even Count = 2
    Odd Count = 3
 */