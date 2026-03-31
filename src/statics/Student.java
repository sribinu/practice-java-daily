package statics;

/**
 * ----------------------------------------------------------
 * Program No   : STA5
 * Question     : Write a program to show how static variables are shared among all objects.
 * Title        : Student.java
 * Author       : Sribinu P
 * Created On   : 31-03-2026
 * Topic        : static (variables)
 * Difficulty   : Easy
 * Description  : Write a program to show how static variables are shared among all objects.
 * ----------------------------------------------------------
 */

public class Student {
    String name;
    static String college = "ABC College";

    public Student(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name    : " + name);
        System.out.println("College : " + college);
    }

    public static void main(String[] args) {
        // Program STA5: Student
        // Static variable = one copy shared by all objects
        Student s1 = new Student("John");
        Student s2 = new Student("Alice");

        s1.college = "DEC College";

        System.out.println("Student 1 Details:");
        s1.display();

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}

/* Output:
    Student 1 Details:
    Name    : John
    College : DEC College

    Student 2 Details:
    Name    : Alice
    College : DEC College
 */