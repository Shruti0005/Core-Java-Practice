package Patterns;

import java.util.Scanner;

public class Star12 {
    public static void main(String[] args) {
        //Print left half pyramid hollow pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = star-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == star || i == j ) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
