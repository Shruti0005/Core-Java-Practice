package Array;

import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        //Kadane's Problem (Maximum sum + subarray)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int count = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
                count++;
            }
        }
        System.out.println("Maximum sum: "+ maxSum + " " +count);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+", ");
        }
        sc.close();
    }
}
