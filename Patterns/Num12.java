package Patterns;

import java.util.Scanner;

public class Num12 {
    public static void main(String[] args) {
        ////print palindrome number triangle pattern
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = num-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(num-j+i-(num-1)+" ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//Input: 4
//Output should be:
//       1 
//     2 1 2
//   3 2 1 2 3 
// 4 3 2 1 2 3 4
