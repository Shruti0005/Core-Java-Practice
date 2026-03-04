package Array;

import java.util.Scanner;

public class Array_2D_4 {
    public static void main(String[] args) {
        //Sum of each column
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

        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Column "+(i+1)+" sum: " + sum);
        }
        sc.close();
    }
}
