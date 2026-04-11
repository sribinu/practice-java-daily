package statics;

/**
 * ----------------------------------------------------------
 * Program No   : STA6
 * Question     : Write a program to create and access a static nested class from another class.
 * Title        : NestedClass.java
 * Author       : Sribinu P
 * Created On   : 11-04-2026
 * Topic        : static (nested class)
 * Difficulty   : Easy
 * Description  : Write a program to create and access a static nested class from another class.
 * ----------------------------------------------------------
 */

class Outer {

    static class Inner {
        public void display() {
            System.out.println("Inside Static Nested Class");
        }
    }
}

public class NestedClass {

    public static void main(String[] args) {
        // Program STA6: NestedClass
        // Static nested class = access using OuterClass.InnerClass (no outer object needed)
        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}

/* Output:
    Inside Static Nested Class
 */