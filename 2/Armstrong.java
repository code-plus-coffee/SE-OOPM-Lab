/**
 * Program to find next armstrong number after a given number
 * 
 * @author D. Kasi Pavan Kumar
 * @date 28 September 2019
 * @version 1.0
 * 
 */

import java.util.Scanner;

public class Armstrong {
    public static void findNextArmstrong(int lowerBound, int higherBound) {
        for(int i = (lowerBound + 1); i <= higherBound; ++i) {
            int buffer = i;
            int digitCount = 0;
            int sumOfDigits = 0;
            int digit = 0;
            
            /* Counting number of digits */
            while(buffer != 0) {
                ++digitCount;
                buffer /= 10;
            }

            buffer = i;

            /* Determining the armstrong */
            while(buffer != 0) {
                digit = buffer % 10;
                sumOfDigits += Math.pow(digit, digitCount);
                buffer /= 10;
            }

            if(sumOfDigits == i) {
                System.out.println(sumOfDigits + " is the next armstrong after " + lowerBound);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* There are 5 armstrong 1 and 999, i.e., 1, 153, 370, 371, 407
            Hence, we set our maximum limit to 1000 */
        final int UPPER_BOUND = 1000;
        
        System.out.print("\nEnter any number: ");
        int number = input.nextInt();

        findNextArmstrong(number, UPPER_BOUND);

        input.close();
    }
}