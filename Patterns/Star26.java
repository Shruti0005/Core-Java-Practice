package Patterns;

import java.util.Scanner;

public class Star26 {
    public static void main(String[] args) {
        //Print lower part of butterfly pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = star; j >= i; j--) {
                System.out.print("* ");
            }
            for (int j = 1; j <= i*2-2; j++) {
                System.out.print("  ");
            }
            for (int j = star; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
