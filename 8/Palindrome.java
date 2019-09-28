// Program to reverse a string and check whether it is palindrome.
// @Author: D. Kasi Pavan Kumar
// @Date: 10 September 2019

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Variable declarations
        StringBuffer firstString = new StringBuffer();
        StringBuffer reversedString = new StringBuffer();
        String originalString, originalReverseString;

        // Scanner object for input stream
        Scanner input = new Scanner(System.in);

        // Taking string as input
        System.out.print("\nEnter a string: ");
        firstString.append(input.nextLine());

        // Converting StringBuffer to String
        originalString = firstString.toString();

        // Reversing the string
        reversedString.append(firstString.reverse());

        // Converting StringBuffer to String
        originalReverseString = reversedString.toString();

        // Displaying the reverse of the string
        System.out.print("Reverse of " + originalString + " is " + reversedString);

        // Checking if the reverse is same as the original string
        // i.e., if it is a palindromic string
        if(originalReverseString.equalsIgnoreCase(originalString)) {
            System.out.println("\n" + originalString + " is a palindromic string.\n");
        }
        else {
            System.out.println("\n" + originalString + " is not a palindromic string.\n");
        }
        input.close();
    }
} // [END OF PROGRAM]