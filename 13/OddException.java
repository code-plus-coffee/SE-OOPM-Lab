// Program to create custom exception messages
// @Author: D. Kasi Pavan Kumar
// @Date: 19 September 2019

import java.lang.Exception;
import java.util.Scanner;

// Class to create user defined exception messages
class OwnException extends Exception {
    private static final long serialVersionUID = 1L;
    int number;

    // Default constructor
    OwnException(int number) {
        this.number = number;
    }

    // This method prints the exception method
    // which overrides the toString() method in the Exception class
    public String toString() {
        return("Exception: " + number + " is a odd number");
    }
}

public class OddException {

    // This method checks for even & odd number which
    // is passed as argument & throws OwnException
    public static void EvenOdd(int number) throws OwnException {
        if(number % 2 == 0) {
            System.out.print("\n" + number + " is a even number");
        }
        else {
            throw new OwnException(number);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        int number = input.nextInt();

        try {
            EvenOdd(number);
        }
        catch(OwnException e) {
            System.out.print("\n" + e);
        }

        input.close();
    }
} // [END OF PROGRAM]