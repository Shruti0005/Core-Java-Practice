package Patterns;

import java.util.Scanner;

public class Num6 {
    public static void main(String[] args) {
        //Print square with number in decreasing row order
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
