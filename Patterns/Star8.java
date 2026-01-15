package Patterns;

import java.util.Scanner;

public class Star8 {
    public static void main(String[] args) {
        //Print diamond pattern
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        //Upper part of the diamond
        for (int i = 1; i <= star; i++) {
            for (int j = star-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Lowwer part of the diamond
        for (int i = 1; i <= star-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
           for (int j = star*2-i-1; j >= i+1; j--) {
            System.out.print("* ");
           }
            System.out.println();
        }
        sc.close();
    }
}
