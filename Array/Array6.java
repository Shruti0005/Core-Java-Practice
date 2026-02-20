package Array;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        //Count even and odd numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements "+ i+": ");
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
            else{
                count1++;
            }
        }
        System.out.println("Even count : "+ count+"\n Odd count : "+ count1);
        sc.close();
    }
}
