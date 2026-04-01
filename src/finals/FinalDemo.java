package finals;

/**
 * ----------------------------------------------------------
 * Program No   : FIN1
 * Question     : Write a program to demonstrate the use of a final variable and show it cannot be reassigned.
 * Title        : FinalDemo.java
 * Author       : Sribinu P
 * Created On   : 01-04-2026
 * Topic        : final (variable)
 * Difficulty   : Easy
 * Description  : Write a program to demonstrate the use of a final variable and show it cannot be reassigned.
 * ----------------------------------------------------------
 */

public class FinalDemo {

    final int number = 10;

    public void show() {
        System.out.println("Number = " + number);

//        number = 20; // CTE: Cannot assign a value to final variable 'number'
    }

    public static void main(String[] args) {
        // Program FIN1: FinalDemo
        // final variable = value assigned once → cannot change
        FinalDemo object = new FinalDemo();
        object.show();
    }
}

/* Output:
    Number = 10
 */