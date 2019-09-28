import java.util.Scanner;

// Program to demonstrate abstraction using interfaces
// @Author: D. Kasi Pavan Kumar
// @Date: 14 September 2019

// Interface to implement backend vehicle mechanism
interface Vehicle {
    public int changeGear(int speed, Boolean isBreakApplied);
    public void speedUp();
    public void applyBreak();
}

// Class to hold bike's mechanism
class Bike implements Vehicle {
    int gear;
    int speed;
    Boolean isBrakeApplied;

    // Default constructor
    public Bike() {
        this.isBrakeApplied = false;
        speed = 0;
        gear = 0;
    }

    // Defining changeGear() method as per
    // bike's speed
    public int changeGear(int speed, Boolean isBrakeApplied) {
        if(this.isBrakeApplied == false) {
            if(speed == 10)
            ++gear; // First gear
            else if(speed == 20)
                ++gear; // Second gear
            else if(speed == 30)
                ++gear; // Third gear
            else if(speed == 40)
                ++gear; // Fourth gear
        }

        if(this.isBrakeApplied == true) {
            if(speed == 0)
                gear = 0;
            else if(speed == 10)
                --gear; // First gear
            else if(speed == 20)
                --gear; // Second gear
            else if(speed == 30)
                --gear; // Third gear
        }
        
        return gear;
    }

    public void speedUp() {
        this.isBrakeApplied = false;
        System.out.println("\nBike has started, speeding up..");
        for(this.speed = 0; speed <= 40; speed += 10) {
            System.out.println("Speed is " + this.speed + " & gear is " + changeGear(speed, isBrakeApplied));
        }
    }

    public void applyBreak() {
        this.isBrakeApplied = true;
        System.out.println("\nApplying break..");
        for(this.speed = 40; speed >= 0; speed -= 10) {
            System.out.println("Speed is " + this.speed + " & gear is " + changeGear(speed, isBrakeApplied));
        }

        System.out.print("\nYou've reached back to home safely.\n");
    }
}

class Car implements Vehicle {
    int gear;
    int speed;
    Boolean isBrakeApplied;

    // Default constructor
    public Car() {
        this.isBrakeApplied = false;
        speed = 0;
        gear = 0;
    }

    // Defining changeGear() method as per
    // car's speed
    public int changeGear(int speed, Boolean isBrakeApplied) {
        if(this.isBrakeApplied == false) {
            if(speed == 15)
                ++gear; // First gear
            else if(speed == 25)
                ++gear; // Second gear
            else if(speed == 35)
                ++gear; // Third gear
            else if(speed == 45)
                ++gear; // Fourth gear
            else if(speed == 55)
                ++gear; // Fifth gear 
        }

        if(this.isBrakeApplied == true) {
            if(speed == 0)
                gear = 0;
            else if(speed == 15)
                gear = 1; // First gear
            else if(speed == 25)
                --gear; // Second gear
            else if(speed == 35)
                --gear; // Third gear
            else if(speed == 45)
                --gear; // Fourth gear
        }
        
        return gear;
    }

    public void speedUp() {
        this.isBrakeApplied = false;
        System.out.println("\nCar has started, speeding up..");
        for(this.speed = 5; speed <= 55; speed += 10) {
            System.out.println("Speed is " + this.speed + " & gear is " + changeGear(this.speed, this.isBrakeApplied));
        }
    }

    public void applyBreak() {
        this.isBrakeApplied = true;
        System.out.println("\nApplying break..");
        for(this.speed = 55; speed >= 0; speed -= 10) {
            System.out.println("Speed is " + this.speed + " & gear is " + changeGear(this.speed, this.isBrakeApplied));
        }

        System.out.print("\nYou've reached back to home safely.\n");
    }
}

public class Transportation {

    public static int displayMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to your garage");
        System.out.println("\n1. Suzuki Hyzunzhu \n2. Toyota Innova Crysta \n3. Not riding");
        System.out.print("\nSelect your ride > ");
        int choice = input.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        Bike hyzunzu = new Bike();
        Car toyotaInnovaCrysta = new Car();
        int choice = 0;

        choice = displayMenu();

        switch(choice) {
            case 1:
                hyzunzu.speedUp();
                hyzunzu.applyBreak();
                break;
            case 2:
                toyotaInnovaCrysta.speedUp();
                toyotaInnovaCrysta.applyBreak();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
} // [END OF PROGRAM]