package finals;

/**
 * ----------------------------------------------------------
 * Program No   : FIN4
 * Question     : Write a program to create a final class and attempt to inherit it to see the compiler error.
 * Title        : FInalClass.java
 * Author       : Sribinu P
 * Created On   : 04-04-2026
 * Topic        : final (class)
 * Difficulty   : Easy
 * Description  : Write a program to create a final class and attempt to inherit it to see the compiler error.
 * ----------------------------------------------------------
 */

final class Parent1 {
    void show() {
        System.out.println("This is a final class method");
    }
}

//class Child1 extends Parent1 { // Cannot inherit from final class 'finals.Parent1'
//    void display() {
//        System.out.println("Child class method");
//    }
//}

public class FinalClass {

    public static void main(String[] args) {
        // Program FIN4: FInalClass
        // final class = cannot be inherited (no subclass allowed)
        Parent1 parent1 = new Parent1();
        parent1.show();
    }
}

/* Output:
    This is a final class method
 */