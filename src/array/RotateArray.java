package array;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : ARR20
 * Question     : Rotate array elements left or right by one position.
 * Title        : RotateArray.java
 * Author       : Sribinu P
 * Created On   : 12-01-2026
 * Topic        : Array (Rotate Array)
 * Difficulty   : Easy
 * Description  : This program rotates an array by one position based on the user’s choice.
 * ----------------------------------------------------------
 */

public class RotateArray {

    public static void main(String[] args) {
        // Program ARR20: RotateArray
        // Left: first element - end, Right: last element - start
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements: ");

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter rotation direction (L for Left / R for Right): ");
        char choice = scan.next().charAt(0);

        if (choice == 'L' || choice == 'l') {
            int temp = arr[0];
            for (int i =  0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = temp;

            System.out.println("Array after LEFT rotation:");
        } else if (choice == 'R' || choice == 'r') {
            int temp = arr[size - 1];
            for (int i =  size - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;

            System.out.println("Array after RIGHT rotation:");
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

        scan.close();
    }
}

/* Output:
    Enter the size of array:
    5
    Enter array elements:
    1
    2
    3
    4
    5
    Enter rotation direction (L for Left / R for Right): l
    Array after LEFT rotation:
    2 3 4 5 1
 */