package Array;

import java.util.Scanner;

public class Array12 {
    public static void main(String[] args) {
        //Search an element (Linear Search)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length value: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the finding value: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found index: "+ i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
