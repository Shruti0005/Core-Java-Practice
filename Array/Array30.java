package Array;

import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
         //Minimum even and odd element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int minEven = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                minEven = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] < minEven) {
                minEven = arr[i];
            }
        }
        System.out.println("Even minimum: "+minEven);

        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                minOdd = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] < minOdd) {
                minOdd = arr[i];
            }
        }
        System.out.println("Odd maximum: "+minOdd);
        sc.close();
    }
}
