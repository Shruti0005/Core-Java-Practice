package Array;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        //Sort an array (using selection sort)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
