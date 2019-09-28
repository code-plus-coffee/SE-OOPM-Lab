// Program to demonstrate threads in Java.
// @Author: D. Kasi Pavan Kumar
// @Date: 19 September 2019

class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("\nFirst Thread Started");
        for(int i = 1; i <= 5; ++i) {
            System.out.print("$");
            try {
                sleep(800);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        System.out.println("\nSecond Thread Started");
        for(int i = 1; i <= 5; ++i) {
            System.out.print("*");
            try {
                sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threads  {
    public static void main(String[] args) {
        FirstThread ThreadOne = new FirstThread();
        SecondThread ThreadTwo = new SecondThread();
        
        ThreadOne.start();
        ThreadTwo.start();
    } // [END OF PROGRAM]
}