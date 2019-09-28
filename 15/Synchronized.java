// Program to demonstrate synchronized methods in Java.
// @Author: D. Kasi Pavan Kumar
// @Date: 19 September 2019

class Table {
    synchronized void PrintTable(int number) {
        for(int i = 1; i <= 10; ++i) {
            System.out.println(number + " * " + i + " = " + (number * i));
            try {
                Thread.sleep(400);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\n");
    }
}

class ThreadOne extends Thread {
    Table table;
    int number;

    ThreadOne(Table table, int number) {
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
        table.PrintTable(this.number);
    }
}

class ThreadTwo extends Thread {
    Table table;
    int number;

    ThreadTwo(Table table, int number) {
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
        table.PrintTable(this.number);
    }
}

public class Synchronized {
    public static void main(String[] args) {
        Table newTable = new Table();
        ThreadOne newThreadOne = new ThreadOne(newTable, 5);
        ThreadTwo newThreadTwo = new ThreadTwo(newTable, 100);

        newThreadOne.start();
        newThreadTwo.start();
    }
}