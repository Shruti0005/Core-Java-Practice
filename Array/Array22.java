package Array;

import java.util.Scanner;

public class Array22 {
    public static void main(String[] args) {
        //print unique elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Unique elements: ");
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
