package finals;

/**
 * ----------------------------------------------------------
 * Program No   : FIN3
 * Question     : Write a program to show that a final method cannot be overridden in a subclass.
 * Title        : FinalMethod.java
 * Author       : Sribinu P
 * Created On   : 03-04-2026
 * Topic        : final (method)
 * Difficulty   : Easy
 * Description  : Write a program to show that a final method cannot be overridden in a subclass.
 * ----------------------------------------------------------
 */

class Parent {
    final void show() {
        System.out.println("This is a final method from Parent");
    }
}

class Child extends Parent {
//    void show() {
//        System.out.println("Overriding method"); // CTE: 'show()' cannot override 'show()' in 'finals.Parent'; overridden method is final
//    }
}

public class FinalMethod {

    public static void main(String[] args) {
        // Program FIN3: FinalMethod
        // final method = cannot be overridden
        Child child = new Child();
        child.show();
    }
}

/* Output:
    This is a final method from Parent
 */