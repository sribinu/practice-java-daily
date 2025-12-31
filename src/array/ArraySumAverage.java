package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR2
 * Question     : Calculate sum and average of array elements.
 * Title        : ArraySumAverage.java
 * Author       : Sribinu P
 * Created On   : 31-12-2025
 * Topic        : Array (Sum & Average)
 * Difficulty   : Easy
 * Description  : This program calculates the sum and average of elements present in an array.
 * ----------------------------------------------------------
 */

public class ArraySumAverage {

    public static void main(String[] args) {
        // Program ARR2: ArraySumAverage
        // Read N → store values → calculate sum → average = sum / N
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter no of elements: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

/* Output:
    Enter 3 elements:
    10
    20
    30
    Sum = 60
    Average = 20.0
 */