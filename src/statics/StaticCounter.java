package statics;

/**
 * ----------------------------------------------------------
 * Program No   : STA7
 * Question     : Write a program to assign unique roll numbers to each student using static counter.
 * Title        : StaticCounter.java
 * Author       : Sribinu P
 * Created On   : 14-04-2026
 * Topic        : static (counter)
 * Difficulty   : Easy
 * Description  : Write a program to assign unique roll numbers to each student using static counter.
 * ----------------------------------------------------------
 */

public class StaticCounter {

    String name;
    int rollNo;

    static int counter = 1;

    public StaticCounter(String name) {
        this.name = name;
        this.rollNo = counter++;
    }

    public void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }

    public static void main(String[] args) {
        // Program STA7: StaticCounter
        // Static counter = auto-increment ID for every object
        StaticCounter s1 = new StaticCounter("John");
        StaticCounter s2 = new StaticCounter("Alice");
        StaticCounter s3 = new StaticCounter("Mike");

        s1.display();
        System.out.println();

        s2.display();
        System.out.println();

        s3.display();
    }
}

/* Output:
    Name    : John
    Roll No : 1

    Name    : Alice
    Roll No : 2

    Name    : Mike
    Roll No : 3
 */