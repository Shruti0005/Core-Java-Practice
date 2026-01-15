package Patterns;

import java.util.Scanner;

public class Star24 {
    public static void main(String[] args) {
        //Print rhombus hollow pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = star-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                if (i==1 || j==1 || j==star || i==star) {
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
