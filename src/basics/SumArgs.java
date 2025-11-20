package basics;

/**
 * ----------------------------------------------------------
 * Program No   : B9
 * Question     : Take two integers from command-line arguments and print their sum.
 * Title        : SumArgs.java
 * Author       : Sribinu P
 * Created On   : 19-11-2025
 * Topic        : Command Line Sum
 * Difficulty   : Very Easy
 * Description  : Using command line args || run it on terminal
 * ----------------------------------------------------------
 */

public class SumArgs {

    public static void main(String[] args) {
        // Program B9: SumArgs
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
    }
}

/* Terminal Output:
    D:\practice-java-daily\src\basics>javac SumArgs.java
    D:\practice-java-daily\src\basics>java SumArgs.java 10 20
    Sum of 10 and 20 is : 30
 */