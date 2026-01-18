package Patterns;

import java.util.Scanner;

public class Num18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for(int j = num; j >= i; j--){
                System.out.print(num-j+1 +" ");
            }
            for (int j = 1; j <= i*2-2; j++) {
                System.out.print("  ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print(j-i+1+" ");
            }
            System.out.println();
        }
        for (int i = num-1; i >= 1; i--) {
            for(int j = num; j >= i; j--){
                System.out.print(num-j+1 +" ");
            }
            for (int j = 1; j <= i*2-2; j++) {
                System.out.print("  ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print(j-i+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//Input: 4
// Output:
// 1 2 3 4 4 3 2 1 
// 1 2 3     3 2 1
// 1 2         2 1
// 1             1
// 1 2         2 1
// 1 2 3     3 2 1
// 1 2 3 4 4 3 2 1