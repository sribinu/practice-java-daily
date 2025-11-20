package datatypes;

/**
 * ----------------------------------------------------------
 * Program No   : DT3
 * Question     : Convert an integer to string and string to integer.
 * Title        : ConvertType.java
 * Author       : Sribinu P
 * Created On   : 20-11-2025
 * Topic        : Convert int to String
 * Difficulty   : Very Easy
 * Description  : Type Conversion using methods
 * ----------------------------------------------------------
 */

public class ConvertType {

    public static void main(String[] args) {
        // Program DT3: ConvertType
        int a = 10;
        String str1 = String.valueOf(a);
        System.out.println("Integer value : " + a);
        System.out.println("Converted to String : " + str1);
        System.out.println("Check type : " + ((Object)str1).getClass().getSimpleName());
        System.out.println();

        String str2 = "100";
        int b = Integer.parseInt(str2);
        System.out.println("String value : " + str2);
        System.out.println("Converted to int : " + b);
        System.out.println("Check Type : " + ((Object) b).getClass().getSimpleName());
    }
}

/* Output:
    Integer value : 10
    Converted to String : 10
    Check type : String

    String value : 100
    Converted to int : 100
    Check Type : Integer
 */