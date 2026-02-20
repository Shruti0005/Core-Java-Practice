package Array;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        //Print element vertically
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
