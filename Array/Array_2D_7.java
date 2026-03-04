package Array;

import java.util.Scanner;

public class Array_2D_7 {
    public static void main(String[] args) {
        //Secondary diagonal elements
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the column: ");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Secondary digonal: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j == row-1) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        sc.close();
    }
}
