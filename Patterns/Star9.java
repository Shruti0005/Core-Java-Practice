package Patterns;

import java.util.Scanner;

public class Star9 {
    public static void main(String[] args) {
        //Print cross pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= star; j++) {
                if (i == j || i + j == star+1) {
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
