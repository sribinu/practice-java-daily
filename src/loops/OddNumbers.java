package loops;

/**
 * ----------------------------------------------------------
 * Program No   : LO4
 * Question     : Print all odd numbers between 1 and 100.
 * Title        : OddNumbers.java
 * Author       : Sribinu P
 * Created On   : 01-12-2025
 * Topic        : Looping
 * Difficulty   : Very Easy
 * Description  : The program starts a for loop from 1 to 100 and find odd numbers.
 * ----------------------------------------------------------
 */

public class OddNumbers {

    public static void main(String[] args) {
        // Program LO4: OddNumbers
        // The loop checks each number from 1 to 100 and prints it only if it is evenly not divisible by 2.
        System.out.println("Odd numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}

/* Output:
    Odd numbers from 1 to 100:
    1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99
 */