package Array;

import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        //Maximum even and odd element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxEven = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                maxEven = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > maxEven) {
                maxEven = arr[i];
            }
        }
        System.out.println("Even maximum: "+maxEven);

        int maxOdd = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                maxOdd = arr[i];
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i] > maxOdd) {
                maxOdd = arr[i];
            }
        }
        System.out.println("Odd maximum: "+maxOdd);
        sc.close();
    }
}
