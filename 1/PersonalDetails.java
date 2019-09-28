/*  
    Program to take input personal details and display the same using Scanner class

    CREDITS:
    Name: D. Kasi Pavan Kumar
    Roll Number: C61
    ID: TUS3F181972
*/

import java.util.Scanner;   // For input stream

class PersonalDetails {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your details below: ");

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Roll Number: ");
        int rollNumber = input.nextInt();

        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.print("Gender: ");
        String gender = input.next();

        System.out.print("Amount of fees paid: ");
        double fees = input.nextDouble();

        // Displaying the details
        System.out.println("\nYour details are as follows:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Fees Paid: " + fees);

        input.close();
    }
}