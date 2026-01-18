package Patterns;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        //print natural number in left half pyramid
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = num-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(n++ +" ");
            }
            System.out.println();
        }
        sc.close(); 
    }
}
