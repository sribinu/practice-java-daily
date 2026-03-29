package statics;

/**
 * ----------------------------------------------------------
 * Program No   : STA3
 * Question     : Write a program to access a static method without creating an object.
 * Title        : Utility.java
 * Author       : Sribinu P
 * Created On   : 29-03-2026
 * Topic        : static (method)
 * Difficulty   : Easy
 * Description  : Write a program to access a static method without creating an object.
 * ----------------------------------------------------------
 */

public class Utility {

    public static void showMessage() {
        System.out.println("Hello from Static Method!");
    }

    public static void main(String[] args) {
        // Program STA3: Utility
        // Static method = call using ClassName.method() (no object needed)
        Utility.showMessage();
    }
}

/* Output:
    Hello from Static Method!
 */