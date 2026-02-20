package Array;

import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        //Reverse array without using second array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;    
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
        }
        sc.close();
    }
}
