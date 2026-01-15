package Patterns;

import java.util.Scanner;

public class Star17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Print reverse right half pyramid hollow pattern
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = star; j >= i; j--) {
                if (j == 1 || i == 1 || j == star || i == j) {
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
