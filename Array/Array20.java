package Array;

import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        //merge two array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length 1:");
        int length1 = sc.nextInt();
        int arr[] = new int[length1];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the length 2:");
        int length2 = sc.nextInt();
        int arr2[] = new int[length2];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int newArr[] = new int[arr.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            newArr[j++] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newArr[j++] = arr2[i];
        }

        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+ " ");
        }
        sc.close();
    }
}
