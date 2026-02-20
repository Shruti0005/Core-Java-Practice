package Array;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // Print all elements of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        
        for(int i = 0; i < a; i++){
            System.out.println("Enter element "+i+" :");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        sc.close();
    }
}
