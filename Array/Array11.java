package Array;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        //Print 1st half array and 2nd half array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.print("\n1st half array: ");
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.print("\n2nd half array: ");
        for(int i = arr.length/2; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
