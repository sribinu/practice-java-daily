package constructor;

/**
 * ----------------------------------------------------------
 * Program No   : CON6
 * Question     : Write a program to demonstrate constructor chaining in inheritance (parent → child).
 * Title        : Child.java
 * Author       : Sribinu P
 * Created On   : 26-03-2026
 * Topic        : Constructor (super keyword)
 * Difficulty   : Easy
 * Description  : Write a program to demonstrate constructor chaining in inheritance.
 * ----------------------------------------------------------
 */

class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
        System.out.println("Parent constructor called");
    }
}

public class Child extends Parent {
    int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Child constructor called");
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {
        // Program CON6: Child
        // super() = call parent class constructor (always runs first)
        Child child = new Child("Sam", 30);

        System.out.println("\nParent Details: ");
        child.display();
    }
}

/* Output:
    Parent constructor called
    Child constructor called

    Parent Details:
    Name : Sam
    Age  : 30
 */