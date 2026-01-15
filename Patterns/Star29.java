package Patterns;

import java.util.Scanner;

public class Star29 {
    public static void main(String[] args) {
        //Print K pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        //upper part of K
        for(int i = 1; i <= star; i++){
            for (int j = star; j >= i; j--) {
                if (i == j || j == star) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Lower part of K
        for (int i = 1; i <= star-1; i++) {
            for (int j = 1; j <= i+1; j++) {
                if (j == 1 || j == i+1) {
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
