package Array;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        //Reverse array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements "+i+": ");
            arr[i] = sc.nextInt();
        }

        int temp[] = new int[arr.length];
        for (int i = 0, j = arr.length-1; i < temp.length; i++, j--) {
            temp[i] = arr[j];
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+ " ");
        }
        sc.close();
    }
}
