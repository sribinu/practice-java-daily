package datatypes;

/**
 * ----------------------------------------------------------
 * Program No   : DT4
 * Question     : Take a boolean variable and toggle its value.
 * Title        : ToggleBoolean.java
 * Author       : Sribinu P
 * Created On   : 20-11-2025
 * Topic        : Toggle Boolean
 * Difficulty   : Very Easy
 * Description  : Boolean Logic conversion with NOT (!) Operator
 * ----------------------------------------------------------
 */

public class ToggleBoolean {

    public static void main(String[] args) {
        // Program DT4: ToggleBoolean
        boolean flag = true;
        System.out.println("Before toggle : " + flag);

        flag = !flag;
        System.out.println("After toggle : " + flag);
    }
}

/* Output:
    Before toggle : true
    After toggle : false
 */