// Program to demonstrate the Vector class in Java Standard Library
// @Author: D. Kasi Pavan Kumar
// @Date: 12 September 2019

import java.util.Vector;
import java.util.Enumeration;
import java.util.Scanner;

public class Students {

    // Method to display menu
    public static int displayMenu() {
        System.out.print("\nSTUDENT MANAGEMENT SYSTSEM");
        System.out.print("\n1. Add a new student \n2. Remove an old student \n3. Display existing student names \n4. Exit");
        System.out.print("\nEnter your choice here: ");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice = 0;

        Scanner input = new Scanner(System.in);
        Vector<String> studentName = new Vector<String>();
        Enumeration<String> students;

        studentName.add("Suresh Vasisht");
        studentName.add("Aniket Savage");
        studentName.add("Linus Sebastian");
        studentName.add("Luke Lafranier");
        studentName.add("Sam Wendover");
        students = studentName.elements();

        do {
            choice = displayMenu();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter the student name: ");
                    String newStudentName = input.nextLine();
                    studentName.add(newStudentName);
                    students = studentName.elements();
                    System.out.print("\n" + newStudentName + " added to the database.\n");
                    break;
                
                case 2:
                    System.out.print("\nEnter the student name to be removed: ");
                    String studentNameToBeDeleted = input.nextLine();
                    Boolean ifStudentNameDeleted = studentName.removeElement(studentNameToBeDeleted);
                    if(ifStudentNameDeleted == true) {
                        System.out.print("\n" + studentNameToBeDeleted + " removed.\n");
                    }
                    else {
                        System.out.print("\n" + studentNameToBeDeleted + " not found.\n");
                    }
                    break;

                case 3:
                    System.out.print("\nStudents currently studying in the institute are: \n");
                    while(students.hasMoreElements()) {
                        System.out.println(students.nextElement());
                    }
                    break;
            
                default:
                    System.out.print("\nInvalid choice!");
                    break;
            }
        } while(choice > 0 && choice <= 4);

        input.close();
    }
}