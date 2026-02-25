package Array;

import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        //All negative value swap toward the left
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
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
