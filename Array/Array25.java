package Array;

import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
         //Two sum problem
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int left = 0;
        int right = length - 1;
        boolean found = false;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println(arr[left]+ " "+arr[right]);
                found = true;
                break;
            }
            else if (sum < target) {
                left++;
            }
            else{

                right--;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}
