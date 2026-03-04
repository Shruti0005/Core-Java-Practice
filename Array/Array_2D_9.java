package Array;

import java.util.Scanner;

public class Array_2D_9 {
    public static void main(String[] args) {
        //Minimum of array
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

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum = "+ min);
        sc.close();
    }
}
