package Patterns;

import java.util.Scanner;

public class Star19 {
    public static void main(String[] args) {
        //Print hourglass pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        //Upper hourglass part
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = star*2-i; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower hourglass part
        for (int i = 1; i <= star-1; i++) {
            for (int j = star-1; j >= i+1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i*2+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
