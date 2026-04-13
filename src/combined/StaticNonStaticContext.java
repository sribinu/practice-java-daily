package combined;

/**
 * ----------------------------------------------------------
 * Program No   : COM5
 * Question     : Write a program showing access differences between static and non-static contexts.
 * Title        : StaticNonStaticContext.java
 * Author       : Sribinu P
 * Created On   : 13-04-2026
 * Topic        : combined (static & non-static)
 * Difficulty   : Easy
 * Description  : Write a program showing access differences between static and non-static contexts.
 * ----------------------------------------------------------
 */

public class StaticNonStaticContext {

    static int staticVar = 100;
    int instanceVar = 50;

    // Static method
    public static void staticMethod() {

        System.out.println("Static Method");

        // Access static variable directly
        System.out.println("Static Variable: " + staticVar);

        // System.out.println(instanceVar); ERROR

        // Access instance variable using object
        StaticNonStaticContext obj = new StaticNonStaticContext();
        System.out.println("Instance Variable: " + obj.instanceVar);
    }

    // Non-static method
    public void instanceMethod() {

        System.out.println("Non-Static Method");

        // Can access both directly
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        // Program COM5: StaticNonStaticContext
        // Static → can access only static directly | Non-static → can access both
        staticMethod();

        System.out.println();

        StaticNonStaticContext obj = new StaticNonStaticContext();
        obj.instanceMethod();
    }
}

/* Output:
    Static Method
    Static Variable: 100
    Instance Variable: 50

    Non-Static Method
    Static Variable: 100
    Instance Variable: 50
 */