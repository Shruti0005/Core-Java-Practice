package Patterns;

import java.util.Scanner;

public class Star18 {
    public static void main(String[] args) {
        //Print square hollow pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= star; j++) {
                if (i == 1 || j == 1 || i == star || j == star) {
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
