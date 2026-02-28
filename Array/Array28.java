package Array;

import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        //print even and odd index elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Even : ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }

        System.out.print("\nOdd: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
