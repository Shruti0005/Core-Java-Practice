package Array;

import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        //All even number move toward left
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length value: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        for (int i : arr) {
            System.out.print(i +" ");
        }
        sc.close();
    }
}
