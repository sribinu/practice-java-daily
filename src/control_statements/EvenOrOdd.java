package control_statements;

/**
 * ----------------------------------------------------------
 * Program No   : CS1
 * Question     : Check whether a number is even or odd using if statement.
 * Title        : EvenOrOdd.java
 * Author       : Sribinu P
 * Created On   : 22-11-2025
 * Topic        : if statement
 * Difficulty   : Very Easy
 * Description  : Odd or even using if statement
 * ----------------------------------------------------------
 */

public class EvenOrOdd {

    public static void main(String[] args) {
        // Program CS1: EvenOrOdd
        int num = 12;
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

/* Output:
    12 is even
 */