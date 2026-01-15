package Patterns;

import java.util.Scanner;

public class Star28 {
    public static void main(String[] args) {
        //Print butterfly hollow pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();

        //Upper hollow butterfly part
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i; j++) {
                if (j==1 || j == i ) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = star*2-i-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Lower hollow butterfly part
        for (int i = 1; i <= star; i++) {
            for (int j = star; j >= i; j--) {
                if (j == star || j == i) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for (int j = 1; j <= i*2-2; j++) {
                System.out.print("  ");
            }
            for (int j = star; j >= i; j--) {
                if (j == star || j == i) {
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
