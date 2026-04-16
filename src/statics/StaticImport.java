package statics;

import static java.lang.Math.*; // static import

/**
 * ----------------------------------------------------------
 * Program No   : STA8
 * Question     : Demonstrate the use of static import for Math class methods.
 * Title        : StaticImport.java
 * Author       : Sribinu P
 * Created On   : 16-04-2026
 * Topic        : static (import)
 * Difficulty   : Easy
 * Description  : Demonstrate the use of static import for Math class methods.
 * ----------------------------------------------------------
 */

public class StaticImport {

    public static void main(String[] args) {
        // Program STA8: StaticImport
        // Static import = use static methods directly without class name
        int a = 16;
        int b = 5;

        // Using Math methods without class name
        System.out.println("Square Root: " + sqrt(a));
        System.out.println("Power: " + pow(a, b));
        System.out.println("Maximum: " + max(a, b));
    }
}

/* Output:
    Square Root: 4.0
    Power: 1048576.0
    Maximum: 16
 */