/*  MATRIX OPERATIONS © 2019
    This program performs various matrix operations like multiplication & transpose */

import java.util.Scanner;

class Operations {
    public static int rows, columns;

    public void Transpose() {
        Scanner input = new Scanner(System.in);

        // Taking number of rows & columns as input
        System.out.print("\nEnter number of rows & columns: ");
        rows = input.nextInt();
        columns = input.nextInt();

        int transposeMatrix[][] = new int[rows][columns]; // To store transposed matrix
        int matrix[][] = new int[rows][columns]; // Subject matrix

        // Taking matrix elements as input
        System.out.print("\nEnter the elements for matrix:\n");
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Displaying the matrix before performing transpose
        System.out.println("\nMatrix before transpose:\n");
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        // Performing transpose operation
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        // Displaying the transpose matrix
        System.out.println("\nMatrix after transpose:\n");
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        input.close();
    }

    public void Multiplication() {
        Scanner input = new Scanner(System.in);

        // Taking number of rows & columns as input
        System.out.print("\nEnter number of rows & columns: ");
        rows = input.nextInt();
        columns = input.nextInt();

        int firstMatrix[][] = new int[rows][columns];
        int secondMatrix[][] = new int[rows][columns];
        int productMatrix[][] = new int[rows][columns]; // To store product of two matrices

        // Taking first matrix elements as input
        System.out.print("\nEnter the elements for first matrix:\n");
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                firstMatrix[i][j] = input.nextInt();
            }
        }

        // Taking second matrix elements as input
        System.out.print("\nEnter the elements for second matrix:\n");
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                secondMatrix[i][j] = input.nextInt();
            }
        }

        if (rows == columns) {
            // Performing multiplication
            for(int i = 0; i < rows; ++i) {
                for(int j = 0; j < columns; ++j) {
                    for(int k = 0; k < columns; ++k) {
                        productMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }
        }

        // Displaying resultant matrix after multiplication
        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < columns; ++j) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        input.close();
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Operations operation = new Operations();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        System.out.print("Matrix Operations\n");
        System.out.print("\n1. Transpose \n2. Multiplication \n3. Exit\n \nEnter your choice: ");
        choice = input.nextInt();

        switch(choice) {
            case 1:
                operation.Transpose();
                break;
            case 2:
                operation.Multiplication();
                break;
            case 3:
                System.exit(0);
        }

    input.close();
    }
} // [END OF PROGRAM]