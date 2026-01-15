package Patterns;

import java.util.Scanner;

public class Star5 {
    public static void main(String[] args) {
        //Print reverse left half pyramid pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i-1; j++) {
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
