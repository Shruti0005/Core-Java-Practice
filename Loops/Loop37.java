package Loops;

import java.util.Scanner;

public class Loop37 {
    public static void main(String[] args) {
        //WAP TO PRINT THE X POWER N ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the power:");
        int x = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= x; i++) {
           result = result * n;
        }
        System.out.println(result);
        sc.close();
    }
}
