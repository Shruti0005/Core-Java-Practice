package Patterns;

import java.util.Scanner;

public class Star14 {
    public static void main(String[] args) {
        //Print triangle hollow pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = star-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                if(i == star || j == 1 || j == i*2-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
