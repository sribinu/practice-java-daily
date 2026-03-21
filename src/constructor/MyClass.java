package constructor;

/**
 * ----------------------------------------------------------
 * Program No   : CON1
 * Question     : Write a Java program to create a class with a default constructor that prints “Object Created”.
 * Title        : MyClass.java
 * Author       : Sribinu P
 * Created On   : 21-03-2026
 * Topic        : Constructor (Default Constructor)
 * Difficulty   : Easy
 * Description  : Create a class with a default constructor that prints: Object Created
 * ----------------------------------------------------------
 */

public class MyClass {

    public MyClass() {
        System.out.println("Object Created");
    }

    public static void main(String[] args) {
        // Program CON1: MyClass
        // Constructor = method with same name as class, no return type, runs automatically on object creation
        MyClass myClass = new MyClass();
    }
}

/* Output:
    Object Created
 */