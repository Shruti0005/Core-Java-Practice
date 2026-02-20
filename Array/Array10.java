package Array;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        //Find Second Smallest Element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
            else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            System.out.println("No second smallest element");
        }
        else{
            System.out.println("Second-minimum element: "+ secondMin);
        }
        sc.close();
    }
}
