package basics;

import java.util.Scanner;

/**
 * ----------------------------------------------------------
 * Program No   : B2
 * Question     : Take user input for name and age, then print a greeting message.
 * Title        : UserInput.java
 * Author       : Sribinu P
 * Created On   : 17-11-2025
 * Topic        : User Input
 * Difficulty   : Easy
 * Description  : Scanner class usage
 * ----------------------------------------------------------
 */

public class UserInput {

    public static void main(String[] args) {
        // Program B2: UserInput
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = scan.nextLine();
        System.out.println("Enter your age ");
        int age = scan.nextInt();

        System.out.println("Hii " + name + "! Your age is " + age);
    }
}

/* Output:
    Enter your name
    Sribinu
    Enter your age
    22
    Hii Sribinu! Your age is 22
*/