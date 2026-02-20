package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        //Find sum of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];

        for (int i = 0; i < l; i++) {
            System.out.print("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of array = " + sum);
        sc.close();
    }
}
