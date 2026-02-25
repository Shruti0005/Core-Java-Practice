package Array;

import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {
        //Sort an array (using bubble sort)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elemets: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
