// Program to demonstrate all the string class methods.
// @Author: D. Kasi Pavan Kumar
// @Date: 10 September 2019

public class StringMethod {
    public static void main(String[] args) {
        String firstString = new String("Java Program");
        String secondString = new String("Welcome to ");

        // Length of string using length() method
        System.out.println("First string's length is " + firstString.length());
        System.out.println("Second string's length is " + secondString.length());

        // Position of any character using indexOf() or lastIndexOf() methods
        System.out.println("Position of 'A' in first string is " + firstString.indexOf('A'));
        System.out.println("Last Position of 'A' in first string is " + firstString.lastIndexOf('A'));

        int start = 5, end = 8;
        char thirdString[] = new char[end - start];

        firstString.getChars(start, end, thirdString, 0);

        String fourthString = new String(thirdString);

        System.out.println("Fourth string is " + fourthString);

        thirdString = firstString.toCharArray();
        int i = 0;

        while(i < thirdString.length) {
            System.out.print(thirdString[i]);
            ++i;
        }

        if(firstString.equals(secondString))
            System.out.println(firstString + " == " + secondString);
        else
            System.out.println(firstString + " != " + secondString);

        if(firstString.equalsIgnoreCase(firstString))
            System.out.println(firstString + " == " + firstString);
        else
            System.out.println(firstString + " != " + secondString);

        System.out.println("Substring from 5th index in first string is " + firstString.substring(5));
        System.out.println("Substring in first string from 9 to 12th index is " + firstString.substring(9, 12));

        // Comparing two string using compareTo()
        int compared = secondString.compareTo(firstString);
        System.out.println("Comparison of second & first string gives " + compared);

        // Concatenating two strings
        String fifthString = new String();
        System.out.println("After concatenation: " + fifthString.concat(firstString));

        System.out.println("After trim: " + fifthString.trim());

        System.out.println("First string after replacing 'A' with 'a' is " + firstString.replace('A', 'a'));

        System.out.println("Lower case of first string is " + firstString.toLowerCase());

        System.out.println("Upper case of first string is " + firstString.toUpperCase());
    }
} // [END OF PROGRAM]