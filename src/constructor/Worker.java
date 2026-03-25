package constructor;

/**
 * ----------------------------------------------------------
 * Program No   : CON5
 * Question     : Write a program to show how one constructor calls another using this() keyword.
 * Title        : Worker.java
 * Author       : Sribinu P
 * Created On   : 25-03-2026
 * Topic        : Constructor (this keyword)
 * Difficulty   : Easy
 * Description  : Write a Java program to demonstrate constructor chaining using this() keyword.
 * ----------------------------------------------------------
 */

public class Worker {
    String name;
    int age;

    public Worker() {
        this("Unknown", 0);
        System.out.println("Default Constructor Called");
    }

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {
        // Program CON5: Worker
        // this() = call another constructor of same class (must be first line)
        Worker w1 = new Worker();

        System.out.println("\nStudent Details:");
        w1.display();
    }
}

/* Output:
    Parameterized Constructor Called
    Default Constructor Called

    Student Details:
    Name : Unknown
    Age  : 0
 */