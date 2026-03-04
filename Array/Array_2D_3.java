package Array;

import java.util.Scanner;

public class Array_2D_3 {
    public static void main(String[] args) {
        //Print sum of each row
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the column: ");
        int column = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[][] = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int rowSum = 0;
        for (int i = 0; i < arr.length; i++) {
            rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row "+(i+1)+" sum: " + rowSum);
        }
        sc.close();
    }
}
