package Array;

import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        //Two sum problem
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i]+", "+arr[j]);
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("Elements not found.");
        }
        sc.close();
    }
}
