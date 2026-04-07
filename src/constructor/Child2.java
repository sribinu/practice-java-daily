package constructor;

/**
 * ----------------------------------------------------------
 * Program No   : CON7
 * Question     : Write a program to call parent constructor from child using super().
 * Title        : Child2.java
 * Author       : Sribinu P
 * Created On   : 07-04-2026
 * Topic        : constructor (super call)
 * Difficulty   : Easy
 * Description  : Write a program to call parent constructor from child using super().
 * ----------------------------------------------------------
 */

class Parent2 {
    public Parent2(String name) {
        System.out.println("Parent constructor called");
        System.out.println("Name: " + name);
    }
}

public class Child2 extends Parent2 {

    int age;

    public Child2(String name, int age) {
        super(name);
        this.age = age;
        System.out.println("Child constructor called");
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        // Program CON7: Child2
        // super() = calls parent constructor (must be first line)
        Child2 object = new Child2("Adam", 22);
    }
}

/* Output:
    Parent constructor called
    Name: Adam
    Child constructor called
    Age : 22
 */