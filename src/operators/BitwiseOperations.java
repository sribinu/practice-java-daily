package operators;

/**
 * ----------------------------------------------------------
 * Program No   : O6
 * Question     : Perform bitwise AND, OR, XOR, complement, left shift, and right shift.
 * Title        : BitwiseOperations.java
 * Author       : Sribinu P
 * Created On   : 21-11-2025
 * Topic        : Bitwise Operations
 * Difficulty   : Very Easy
 * Description  : Bitwise Operators usage
 * ----------------------------------------------------------
 */

public class BitwiseOperations {

    public static void main(String[] args) {
        // Program O6: BitwiseOperations
        int a = 10;   // 1010 in binary
        int b = 5;    // 0101 in binary

        System.out.println("a = " + a + " (binary: 1010)");
        System.out.println("b = " + b + " (binary: 0101)");
        System.out.println("----------------------------------");

        // Bitwise AND
        System.out.println("a & b  = " + (a & b));   // 1010 & 0101 = 0000 → 0

        // Bitwise OR
        System.out.println("a | b  = " + (a | b));   // 1010 | 0101 = 1111 → 15

        // Bitwise XOR - Both should be 00 or 11 for true, otherwise false
        System.out.println("a ^ b  = " + (a ^ b));   // 1010 ^ 0101 = 1111 → 15

        // Bitwise Complement
        System.out.println("~a     = " + (~a));      // flips all bits → -11

        // Left Shift
        System.out.println("a << 1 = " + (a << 1));  // 1010 → 10100 = 20

        // Right Shift
        System.out.println("a >> 1 = " + (a >> 1));  // 1010 → 0101 = 5

        // Unsigned Right Shift
        System.out.println("a >>> 1 = " + (a >>> 1)); // fills with 0 on left
    }
}

/* Output:
    a = 10 (binary: 1010)
    b = 5 (binary: 0101)
    ----------------------------------
    a & b  = 0
    a | b  = 15
    a ^ b  = 15
    ~a     = -11
    a << 1 = 20
    a >> 1 = 5
    a >>> 1 = 5
 */