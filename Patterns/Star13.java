package Patterns;

import java.util.Scanner;

public class Star13 {
    public static void main(String[] args) {
        //Print reverse triangle hollow pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = star*2-i; j >= i; j--) {
                if (i == j || i == 1 || j == star*2-i) {
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
