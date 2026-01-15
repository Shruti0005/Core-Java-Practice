package Patterns;

import java.util.Scanner;

public class Star2 {
    public static void main(String[] args) {
        //Print right half pyramid pattern
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
