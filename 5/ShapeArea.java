/* 
    Program to calculate area of
        - Circle
        - Square
        - Rectangle
        - Triangle

    using method overloading

    @author
    D. Kasi Pavan Kumar
    C61
    TUS3F181972
*/

import java.util.Scanner;

public class ShapeArea {

    // Circle
    public static void Area(float radius) {
        double area = (Math.PI * radius * radius);
        System.out.println("Area of circle = " + area);
    }

    // Square
    public static void Area(int side) {
        double area = Math.pow(side, 2);
        System.out.println("Area of square = " + area);
    }
    
    // Rectangle
    public static void Area(float length, float breadth) {
        float area = length * breadth;
        System.out.println("Area of rectangle = " + area);
    }
    
    // Triangle
    public static void Area(int base, float height) {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle = " + area);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\t\t\t\tAREA OF GEOMETRIC SHAPES");
        System.out.print("\n\n1. Circle \n2. Triangle \n3. Rectangle \n4. Square \n\nChoice > ");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                // Circle
                System.out.print("\n\nEnter radius of the circle > ");
                float radius = input.nextFloat();
                Area(radius);
                break;

            case 2:
                // Triangle
                System.out.print("\n\nEnter base and height of  the triangle> ");
                int base = input.nextInt();
                float height = input.nextFloat();
                Area(base, height);
                break;

            case 3:
                // Rectangle
                System.out.print("\n\nEnter length & breadth of rectangle > ");
                float length = input.nextFloat();
                float breadth = input.nextFloat();
                Area(length, breadth);
                break;

            case 4:
                // Square
                System.out.print("\n\nEnter side of square > ");
                int side = input.nextInt();
                Area(side);
                break;

            default:
                // Invalid choice
                System.out.print("\n\nInvalid choice.");
                break;
        }
        input.close();
    }
}