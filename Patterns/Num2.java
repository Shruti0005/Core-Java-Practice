package Patterns;

import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        //Print binary 0-1 in right half pyramid pattern
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
                }
                System.out.println();
        }
        sc.close();
    }
}
