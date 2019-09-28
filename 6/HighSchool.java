// Program to demonstrate use of packages in Java

import MCA.mcaUndergrad;
import java.util.Scanner;

public class HighSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rollNumber, studentAge, numberOfSubjects, outOfMarks;
        String studentName;

        System.out.print("\n\t\t\t\t\tWELCOME TO HIGH SCHOOL\n\t\t\t\t\t----------------------");

        System.out.print("\nEnter student's name -> ");
        studentName = input.nextLine();

        System.out.print("\nEnter student's age -> ");
        studentAge = input.nextInt();

        System.out.print("\nEnter student's roll number -> ");
        rollNumber = input.nextInt();

        System.out.print("\nEnter number of subjects -> ");
        numberOfSubjects = input.nextInt();

        int[] marks = new int[numberOfSubjects];

        System.out.print("\nEnter student's marks below as indicated:\n");

        for(int i = 0; i < numberOfSubjects; ++i) {
            System.out.print("\nSubject " + (i + 1) + " -> ");
            marks[i] = input.nextInt();
        }

        System.out.print("\nEnter out of marks -> ");
        outOfMarks = input.nextInt();

        mcaUndergrad one = new mcaUndergrad(studentName, rollNumber, studentAge, numberOfSubjects, marks, outOfMarks);
        one.computeTotalMarksAndPercentage();
        one.putStudentDetails();

        input.close();
    }
}