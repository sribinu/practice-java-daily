package loops;

/**
 * ----------------------------------------------------------
 * Program No   : LO3
 * Question     : Print all even numbers between 1 and 100.
 * Title        : EvenNumbers.java
 * Author       : Sribinu P
 * Created On   : 01-12-2025
 * Topic        : Looping
 * Difficulty   : Very Easy
 * Description  : The program starts a for loop from 1 to 100 and find odd numbers.
 * ----------------------------------------------------------
 */

public class EvenNumbers {

    public static void main(String[] args) {
        // Program LO3: EvenNumbers
        // The loop checks each number from 1 to 100 and prints it only if it is evenly divisible by 2.
        System.out.println("Even numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
    }
}

/* Output:
    Even numbers from 1 to 100:
    2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100
 */