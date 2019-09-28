/*
    Program to count the following parameters from a string:
        > Uppercase letters
        > Lowercase letters
        > Vowels
        > Special symbols

    AUTHOR:
    Name: D. Kasi Pavan Kumar
    Roll Number: C61
    ID: TUS3F181972
*/

import java.util.Scanner;

class Tracking {
    int upperCaseCount, lowerCaseCount, vowelCount, specialSymbolCount;

    public Tracking(int upperCaseCount, int lowerCaseCount, int vowelCount, int specialSymbolCount) {
        this.lowerCaseCount = lowerCaseCount;
        this.upperCaseCount = upperCaseCount;
        this.vowelCount = vowelCount;
        this.specialSymbolCount = specialSymbolCount;
    }

    public void Display() {
        System.out.println("\n\nThe string contains the following parameters:\n");
        System.out.println("> Lowercase letters = " + lowerCaseCount);
        System.out.println("> Uppercase letters = " + upperCaseCount);
        System.out.println("> Vowels = " + vowelCount);
        System.out.println("> Special symbols = " + specialSymbolCount + "\n");
    }

}
class StringOperations {
    public static boolean isVowel(char letterFromString) {
        char ch = letterFromString;
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int upperCaseCount, lowerCaseCount, vowelCount, specialSymbolCount;

        upperCaseCount = lowerCaseCount = vowelCount = specialSymbolCount = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter any string: ");
        String word = input.nextLine();

        for(int A = 0; A < word.length(); A++) {

            char letterInString = word.charAt(A);

            if(Character.isLowerCase(letterInString)) {
                lowerCaseCount++;
                if(isVowel(letterInString)) {
                    vowelCount++;
                }
            }

            else if(Character.isUpperCase(letterInString)) {
                upperCaseCount++;
                if(isVowel(letterInString)) {
                    vowelCount++;
                }
            }

            else
                specialSymbolCount++;
        }

        Tracking trackNumber = new Tracking(upperCaseCount, lowerCaseCount, vowelCount, specialSymbolCount);

        trackNumber.Display();

        input.close();  
    }
}