package Array;

import java.util.Scanner;

public class Array_2D_8 {
    public static void main(String[] args) {
        //Transpose of Matrix (Swap rows and columns)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row = sc.nextInt();
        System.out.println("Enter the column: ");
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        System.out.println("Enter elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int temp[][] = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                temp[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose matrix: ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                 System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
