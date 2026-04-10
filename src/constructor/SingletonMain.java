package constructor;

/**
 * ----------------------------------------------------------
 * Program No   : CON9
 * Question     : Write a program to demonstrate the use of a private constructor in a Singleton pattern.
 * Title        : SingletonMain.java
 * Author       : Sribinu P
 * Created On   : 10-04-2026
 * Topic        : constructor (singleton pattern)
 * Difficulty   : Easy
 * Description  : Write a program to demonstrate the use of a private constructor in a Singleton pattern.
 * ----------------------------------------------------------
 */

class Singleton {

    // Static variable to hold single instance
    private static Singleton instance;

    // Private constructor (cannot create object outside)
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Static method to provide instance
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton(); // create only once
        }

        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton Object");
    }
}


public class SingletonMain {

    public static void main(String[] args) {
        // Program CON9: SingletonMain
        // Singleton = one object → private constructor + static instance
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        obj1.showMessage();
        obj2.showMessage();

        System.out.println(obj1 == obj2);
    }
}

/* Output:
    Singleton Instance Created
    Hello from Singleton Object
    Hello from Singleton Object
    true
 */