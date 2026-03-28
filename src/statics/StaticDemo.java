package statics;

/**
 * ----------------------------------------------------------
 * Program No   : STA2
 * Question     : Write a program to demonstrate a static block that executes before the main method.
 * Title        : StaticDemo.java
 * Author       : Sribinu P
 * Created On   : 28-03-2026
 * Topic        : static (execution)
 * Difficulty   : Easy
 * Description  : Write a program to demonstrate a static block that executes before the main method.
 * ----------------------------------------------------------
 */

public class StaticDemo {

    static {
        System.out.println("static block executed");
    }

    public StaticDemo() {
        System.out.println("constructor executed");
    }

    public static void main(String[] args) {
        // Program STA2: StaticDemo
        // static block runs first when class is loaded (even before main())
        System.out.println("main method executed");
        StaticDemo staticDemo = new StaticDemo();
    }
}

/* Output:
    static block executed
    main method executed
    constructor executed
 */