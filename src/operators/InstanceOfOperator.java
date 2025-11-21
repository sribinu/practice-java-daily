package operators;

/**
 * ----------------------------------------------------------
 * Program No   : O7
 * Question     : Demonstrate instanceof with class inheritance.
 * Title        : InstanceOfOperator.java
 * Author       : Sribinu P
 * Created On   : 21-11-2025
 * Topic        : instanceof operator
 * Difficulty   : Very Easy
 * Description  : Program to demonstrate how instanceof works with parent–child inheritance in Java.
 * ----------------------------------------------------------
 */
class Animal {

}

class Dog extends Animal {

}

public class InstanceOfOperator {

    public static void main(String[] args) {
        // Program O7: InstanceOfOperator
        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println(d instanceof Dog);      // true
        System.out.println(d instanceof Animal);   // true (child is also parent type)
        System.out.println(a instanceof Dog);      // false
        System.out.println(a instanceof Animal);   // true
    }
}

/* Output:
    true
    true
    false
    true
 */