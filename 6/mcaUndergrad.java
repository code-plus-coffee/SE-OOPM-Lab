package MCA;

public class mcaUndergrad {
    // Data members
    int rollNumber, studentAge, numberOfSubjects, totalMarks, outOfMarks, marks[];
    float studentPercentage;
    String studentName;

    // Parameterized constructor to fetch the provided details of a student
    public mcaUndergrad(String studentName, int rollNumber, int studentAge, int numberOfSubjects, int studentMarks[], int outOfMarks) {
        this.rollNumber = rollNumber;
        this.studentAge = studentAge;
        this.studentName = studentName;
        this.numberOfSubjects = numberOfSubjects;
        this.marks = studentMarks;
        this.outOfMarks = (numberOfSubjects * outOfMarks);
    } // [END OF CONSTRUCTOR]

    // Method to compute total marks & percentage
    public void computeTotalMarksAndPercentage() {
        for(int a = 0; a < numberOfSubjects; ++a) {
            totalMarks += marks[a];
        }

        studentPercentage = ((totalMarks * 100) / outOfMarks);
    } // [END OF METHOD]

    // Method to print the student details
    public void putStudentDetails() {
        System.out.println("\nSTUDENT DETAILS:\n----------------");
        System.out.println("\nStudent's name is " + studentName);
        System.out.println("\nStudent's roll number is " + rollNumber);
        System.out.println("\nStudent's age is " + studentAge);
        System.out.println("\nStudent's marks are as follows:\n");
        for(int a = 0; a < numberOfSubjects; ++a) {
            System.out.println("Subject " + (a + 1) + ": " + marks[a] + "\n");
        } // [END OF LOOP]
        System.out.println("Student's total marks is " + totalMarks + " / " + outOfMarks);
        System.out.println("\nStudent's percentage is " + studentPercentage + "%");
    } // [END OF METHOD: putStudentDetails()]
} // [END OF CLASS: mcaUndergrad]