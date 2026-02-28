package Array;

import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        //print distinct elements (remove duplicate)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
