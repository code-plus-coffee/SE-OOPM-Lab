// Program to demonstrate inheritance in Java
// @Author: D. Kasi Pavan Kumar
// @Date: 14 September 2019

// Class student to hold student's details
class Student {
    String name;
    int rollNumber;

    // Default constructor
    public Student() {
        this.name = null;
        this.rollNumber = 0;
    }

    // Parameterized constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

// Test class contains the marks of student
class Test extends Student {
    int marks1, marks2;

    // Default constructor
    public Test() {
        this.marks1 = 0;
        this.marks2 = 0;
    }

    // Parameterized constructor
    public Test(String name, int rollNumber, int marks1, int marks2) {
        super(name, rollNumber);
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
}

// Result class computes total marks & display the result with student details
class Result extends Test {
    int totalMarks;
    
    // Parameterized constructor
    public Result(String name, int rollNumber, int marks1, int marks2) {
        super(name, rollNumber, marks1, marks2);
        this.totalMarks = 0;
    }

    // Method to calculate total marks
    public void computeTotalMarks() {
        this.totalMarks = marks1 + marks2;
    }

    // Method to display student details along with result
    public void displayStudentDetails() {
        computeTotalMarks();
        System.out.print("\nSTUDENT DETAILS");
        System.out.print("\nStudent's name is " + name);
        System.out.print("\nStudent's roll number is " + rollNumber);
        System.out.print("\nStudent's marks in subject 1 is " + this.marks1);
        System.out.print("\nStudent's marks in subject 2 is " + this.marks2);
        System.out.print("\nTotal marks is " + this.totalMarks + "\n");
    }
}

public class SemesterExam {
    public static void main(String[] args) {
        Result Student1 = new Result("Zedd", 15, 70, 95);
        Result Student2 = new Result("Jon Bellion", 54, 95, 95) ;
        Result Student3 = new Result("Skrillex", 55, 65, 85);

        Student1.displayStudentDetails();
        Student2.displayStudentDetails();
        Student3.displayStudentDetails();
    }
}