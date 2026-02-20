package Array;

import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) {
        //Find Second Largest Element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element "+i+": ");
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        if(secondMax == Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }
        else{
            System.out.println("Second Largest element of array: "+ secondMax);
        }
        sc.close();
    }
}
