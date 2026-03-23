package constructor;

/**
 * ----------------------------------------------------------
 * Program No   : CON3
 * Question     : Write a Java program to demonstrate constructor overloading using different numbers of parameters.
 * Title        : Student.java
 * Author       : Sribinu P
 * Created On   : 23-03-2026
 * Topic        : Constructor (Overloading)
 * Difficulty   : Easy
 * Description  : Demonstrate constructor overloading using different numbers of parameters.
 * ----------------------------------------------------------
 */

public class Student {
    String name;
    int age;
    String course;

    public Student() {
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Assigned";
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public static void main(String[] args) {
        // Program CON3: Student
        // Same constructor name + different parameter list = constructor overloading
        Student student1 = new Student();
        student1.display();
        Student student2 = new Student("Adam", 20);
        student2.display();
        Student student3 = new Student("Sam", 22, "Java");
        student3.display();
    }

    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
        System.out.println();
    }
}

/* Output:
    Name   : Unknown
    Age    : 0
    Course : Not Assigned

    Name   : Adam
    Age    : 20
    Course : Not Assigned

    Name   : Sam
    Age    : 22
    Course : Java
 */