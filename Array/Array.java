package Array;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        //Store elements in seperate array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            arr2[i] = arr[j++];
        }

        for(int i : arr2){
            System.out.print(i + " ");
        }    
        sc.close();
    }
}
