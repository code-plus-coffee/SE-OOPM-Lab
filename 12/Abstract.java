// Program to demonstrate abstract classes in Java.
// @Author: D. Kasi Pavan Kumar
// @Date: 18 September 2019

import java.util.Scanner;

abstract class AbstractSum {
    abstract public int sumOfTwoNumbers(int first, int second); 
    abstract public int sumOfThreeNumbers(int first, int second, int third);
}

class Sum extends AbstractSum {
    public int sumOfTwoNumbers(int first, int second) {
        return(first + second);
    }

    public int sumOfThreeNumbers(int first, int second, int third) {
        return(first + second + third);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sum newSum = new Sum();
        int first, second, third;
        int sum = 0;

        System.out.println("ABSTRACT CLASSES\n");

        System.out.print("How many number you want to add? \n> ");
        int numbersCount = input.nextInt();

        if(numbersCount == 2) {
            System.out.print("\nEnter two numbers: ");
            first = input.nextInt();
            second = input.nextInt();
            sum = newSum.sumOfTwoNumbers(first, second);
            System.out.println("\n" + first + " + " + second + " = " + sum);
        } 
        else if(numbersCount == 3) {
            System.out.print("\nEnter three numbers: ");
            first = input.nextInt();
            second = input.nextInt();
            third = input.nextInt();
            sum = newSum.sumOfThreeNumbers(first, second, third);
            System.out.println("\n" + first + " + " + second + " + " + third + " = " + sum);
        }
        input.close();
    } // [END OF PROGRAM]
}