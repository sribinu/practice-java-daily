package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ----------------------------------------------------------
 * Program No   : ARR15
 * Question     : Find duplicate elements in an array.
 * Title        : DuplicateElements.java
 * Author       : Sribinu P
 * Created On   : 08-01-2026
 * Topic        : Array (Duplicate Elements)
 * Difficulty   : Easy
 * Description  :
 * ----------------------------------------------------------
 */

public class DuplicateElements {

    public static void main(String[] args) {
        // Program ARR15: DuplicateElements

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1, 7};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Duplicate elements: ");

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {  // add() returns false if already present
                duplicates.add(num);
            }
        }

        System.out.println(duplicates);
    }
}

/* Output:

 */