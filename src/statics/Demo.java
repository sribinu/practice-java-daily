package statics;

/**
 * ----------------------------------------------------------
 * Program No   : STA4
 * Question     : Write a program to show why static methods cannot access non-static variables directly.
 * Title        : Demo.java
 * Author       : Sribinu P
 * Created On   : 30-03-2026
 * Topic        : static (methods)
 * Difficulty   : Easy
 * Description  : Write a program to show why static methods cannot access non-static variables directly.
 * ----------------------------------------------------------
 */

public class Demo {

    int number = 10;

    public static void show() {
//        System.out.println(number); // CTE: non-static variable number cannot be referenced from a static context

        Demo demo = new Demo();
        System.out.println("Number = " + demo.number);
    }

    public static void main(String[] args) {
        // Program STA4: Demo
        // Static → class level | Non-static → object level → so object needed
        show();
    }
}

/* Output:
    Number = 10
 */