package Array;

import java.util.Scanner;

public class Array21 {
    public static void main(String[] args) {
        //print duplicate elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Duplicate Elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            boolean alreadyPrinted = false;
            
            //check duplicate
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            //print duplicate
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (isDuplicate && !alreadyPrinted) {
                System.err.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
