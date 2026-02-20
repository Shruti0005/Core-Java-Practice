package Array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        //Find average of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int l = sc.nextInt();
        int arr[] = new int[l];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements "+ i+": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double avg = (double) sum / l;
        System.out.println("Average of array: "+ avg);

        sc.close();
    }
}
