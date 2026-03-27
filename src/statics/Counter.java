package statics;

/**
 * ----------------------------------------------------------
 * Program No   : STA1
 * Question     : Write a program to count how many objects of a class are created using a static variable.
 * Title        : Counter.java
 * Author       : Sribinu P
 * Created On   : 27-03-2026
 * Topic        : static (counter)
 * Difficulty   : Easy
 * Description  : Write a program to count how many objects of a class are created using a static variable.
 * ----------------------------------------------------------
 */

public class Counter {

    static int count = 0;

    public Counter() {
        count++;
        System.out.println("Object created. Count = " + count);
    }

    public static void main(String[] args) {
        // Program STA1: Counter
        // static variable = shared by all objects → perfect for counting objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("\nTotal objects created: " + Counter.count);
    }
}

/* Output:
    Object created. Count = 1
    Object created. Count = 2
    Object created. Count = 3

    Total objects created: 3
 */