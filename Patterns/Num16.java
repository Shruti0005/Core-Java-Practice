package Patterns;

import java.util.Scanner;

public class Num16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(num+1-j+" ");
            }
            System.out.println();
        }
        for (int i = num-1; i >= 1; i--) {
            for (int j = num; j >= i; j--) {
                System.out.print(num+1-j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//Input: 4
//Output:
// 1 2 3 4 
// 1 2 3
// 1 2
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
