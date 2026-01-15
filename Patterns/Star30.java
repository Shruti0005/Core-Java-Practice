package Patterns;

import java.util.Scanner;

public class Star30 {
    public static void main(String[] args) {
         //Print hollow K pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        //Upper hollow K part
        for(int i = 1; i <= star; i++){
            for (int j = star; j >= i; j--) {
                if (i == j || j == star || i == 1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Lower hollow K part
        for (int i = 1; i <= star-1; i++) {
            for (int j = 1; j <= i+1; j++) {
                if (j == 1 || j == i+1 || i == star-1) {
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
