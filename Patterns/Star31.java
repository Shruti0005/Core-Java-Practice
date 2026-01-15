package Patterns;

import java.util.Scanner;

public class Star31 {
    public static void main(String[] args) {
         //Print hollow hourglass pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        //Upper hourglass hollow part
        for(int i = 1; i <= star; i++){
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = star*2-i; j >= i; j--) {
                if (i == j || j == star*2-i || i == 1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Lower hourglass hollow part
        for (int i = 1; i <= star-1; i++) {
            for (int j = star-1; j >= i+1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i*2+1; j++) {
                if (j == 1 || j == i*2+1 || i == star-1) {
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
