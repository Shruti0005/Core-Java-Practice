package Patterns;

import java.util.Scanner;

public class Star25 {
    public static void main(String[] args) {
        //Print upper part of butterfly pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = star*2-i-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
