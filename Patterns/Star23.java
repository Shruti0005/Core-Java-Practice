package Patterns;

import java.util.Scanner;

public class Star23 {
    public static void main(String[] args) {
         //Print left pascal's triangle
         Scanner sc = new Scanner(System.in);
         int star = sc.nextInt();

         //Upper left pascal's triangle part
         for (int i = 1; i <= star; i++) {
            for (int j = star-1; j >=i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
         }
         //Lower left pascal's triangle part
         for (int i = 1; i <= star-1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = star-1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
         }
         sc.close();
    }
}
