package operators;

/**
 * ----------------------------------------------------------
 * Program No   : O5
 * Question     : Find the largest of three numbers using the ternary operator.
 * Title        : LargestOf3.java
 * Author       : Sribinu P
 * Created On   : 21-11-2025
 * Topic        : Largest of three numbers
 * Difficulty   : Easy
 * Description  : Ternary Operator usage
 * ----------------------------------------------------------
 */

public class LargestOf3 {

    public static void main(String[] args) {
        // Program O5: LargestOf3
        int a = 10 , b = 20 , c = 30;

        int largest = (a > b) ?
                ((a > c) ? a : c ) :
                ((b > c) ? b : c);

        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Largest number = " + largest);
    }
}

/* Output:
    Numbers: 10, 20, 30
    Largest number = 30
 */