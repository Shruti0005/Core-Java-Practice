package Array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        //Find minimum element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements "+ i+": ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: "+ min);
        sc.close();
    }
}
