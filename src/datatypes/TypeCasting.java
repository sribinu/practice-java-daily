package datatypes;

/**
 * ----------------------------------------------------------
 * Program No   : DT1
 * Question     : Demonstrate implicit and explicit type casting.
 * Title        : TypeCasting.java
 * Author       : Sribinu P
 * Created On   : 20-11-2025
 * Topic        : Type Casting
 * Difficulty   : Very Easy
 * Description  : Type Casting
 * ----------------------------------------------------------
 */

public class TypeCasting {

    public static void main(String[] args) {
        // Program DT1: TypeCasting
        // Implicit Typecasting
        int a = 10;
        double b = a; // automatic widening
        System.out.println("Implicit Casting (int → double): " + b);

        // Explicit Typecasting
        double c = 20;
        int d = (int) c;
        System.out.println("Explicit Casting (double → int): " + d);
    }
}

/* Output:
    Implicit Casting (int → double): 10.0
    Explicit Casting (double → int): 20
 */