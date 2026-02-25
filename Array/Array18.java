package Array;

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        //Binary search using selection sort
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nEnter the finding value:");
        int key = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        boolean found = false;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                System.out.println("Found index: "+mid);
                found = true;
                break;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Index not found");
        }
        sc.close();
    }
}
