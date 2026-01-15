package Patterns;

import java.util.Scanner;

public class Star10 {
    public static void main(String[] args) {
        //Print plus pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= star; j++) {
                if (i == star/2+1 || j == star/2+1) {
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
