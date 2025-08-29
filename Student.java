// Create a Student class in Java with the following attributes:
// •	rollNo (int)
// •	name (String)
// •	cname (String → college name)
// •	subject (String)
// •	mark (int → marks obtained in the subject)
// Define the following methods inside the Student class:
// 1.	acceptDetails() → accepts student details (rollNo, name, cname, subject, mark) using Scanner.
// 2.	displayStudentInfo() → displays the student’s roll number, name, college name, subject, and mark.
// 3.	findResult() → determines the result as "Pass" if the student’s mark is ≥ 40, otherwise "Fail".
// Write a main class (StudentTest) to:
// •	Create 5 Student objects.
// •	Call acceptDetails() for each student to input details.
// •	Display each student’s information and result using displayStudentInfo() and findResult().


import java.util.Scanner;

public class Student {
    int rollNum;
    String name;
    String cName;
    String sub;
    int marks;

    // Accept details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNum = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter College Name: ");
        cName = sc.nextLine();

        System.out.print("Enter Subject: ");
        sub = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextInt();
    }

    // Display student info
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Name: " + name);
        System.out.println("College Name: " + cName);
        System.out.println("Subject: " + sub);
        System.out.println("Marks: " + marks);
    }

    // Find result
    public void findResult() {
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}


