package Array;

import java.util.Scanner;

public class Array_2D_11 {
    public static void main(String[] args) {
        //Matrix Multiplication
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the column: ");
        int column = sc.nextInt();

        //1st array
        int arr1[][] = new int[row][column];
        System.out.println("Enter 1st array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        //2nd array
        int arr2[][] = new int[row][column];
        System.out.println("Enter 2nd array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int multi[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < column; k++) {
                     multi[i][j] = multi[i][j] + arr1[i][k] * arr2[k][j];    
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
