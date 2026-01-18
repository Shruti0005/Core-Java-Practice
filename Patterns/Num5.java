package Patterns;

import java.util.Scanner;

public class Num5 {
    public static void main(String[] args) {
        //Print right half pyramid with number in increasing row order, aligned to the right.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
