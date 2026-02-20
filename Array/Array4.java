package Array;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        //Find maximum element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements "+ i+": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element of array: "+ max);
        sc.close();
    }
}
