package Patterns;

import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        //Print left half pyramid with number in decreasing row order, aligned to the left.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (num+1)-i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
