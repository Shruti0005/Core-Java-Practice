package Patterns;

import java.util.Scanner;

public class Num1 {
    public static void main(String[] args) {
        //Print natural number in square pattern
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(n++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
