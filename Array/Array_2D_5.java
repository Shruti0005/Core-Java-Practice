package Array;

import java.util.Scanner;

public class Array_2D_5 {
    public static void main(String[] args) {
        //Find Maximum Element in 2D Array
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

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum = "+max);
        sc.close();
    }
}
