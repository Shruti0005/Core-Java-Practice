package Patterns;

import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (int i = num-1; i >= 1; i--) {
            for (int j = 1; j <= num-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//output :-
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//  3 3 3 
//   2 2
//    1