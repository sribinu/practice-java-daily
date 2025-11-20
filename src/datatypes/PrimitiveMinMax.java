package datatypes;

/**
 * ----------------------------------------------------------
 * Program No   : DT2
 * Question     : Print min and max values of all primitive data types using wrapper constants.
 * Title        : PrimitiveMinMax.java
 * Author       : Sribinu P
 * Created On   : 20-11-2025
 * Topic        : Data Range Check
 * Difficulty   : Very Easy
 * Description  : Use MIN_VALUE, MAX_VALUE values of Wrapper Classes
 * ----------------------------------------------------------
 */

public class PrimitiveMinMax {

    public static void main(String[] args) {
        // Program DT2: PrimitiveMinMax
        System.out.println("----- MIN & MAX VALUES OF PRIMITIVE DATA TYPES -----");

        System.out.println("Byte    : Min = " + Byte.MIN_VALUE    + " | Max = " + Byte.MAX_VALUE);
        System.out.println("Short   : Min = " + Short.MIN_VALUE   + " | Max = " + Short.MAX_VALUE);
        System.out.println("Integer : Min = " + Integer.MIN_VALUE + " | Max = " + Integer.MAX_VALUE);
        System.out.println("Long    : Min = " + Long.MIN_VALUE    + " | Max = " + Long.MAX_VALUE);

        System.out.println("Float   : Min = " + Float.MIN_VALUE   + " | Max = " + Float.MAX_VALUE);
        System.out.println("Double  : Min = " + Double.MIN_VALUE  + " | Max = " + Double.MAX_VALUE);

        System.out.println("Character : Min = " + (int) Character.MIN_VALUE +
                " | Max = " + (int) Character.MAX_VALUE);

        System.out.println("Boolean   : Only true / false (no min/max range)");
    }
}

/* Output:
    ----- MIN & MAX VALUES OF PRIMITIVE DATA TYPES -----
    Byte    : Min = -128 | Max = 127
    Short   : Min = -32768 | Max = 32767
    Integer : Min = -2147483648 | Max = 2147483647
    Long    : Min = -9223372036854775808 | Max = 9223372036854775807
    Float   : Min = 1.4E-45 | Max = 3.4028235E38
    Double  : Min = 4.9E-324 | Max = 1.7976931348623157E308
    Character : Min = 0 | Max = 65535
    Boolean   : Only true / false (no min/max range)
 */