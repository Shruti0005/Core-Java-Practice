package Patterns;

import java.util.Scanner;

public class Num13 {
    public static void main(String[] args) {
        //print palindrome number reverse triangle pattern
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print(j-i+1+" ");
            }
            for (int j = num; j >= i+1; j--) {
                System.out.print(num-j+2+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//Input: 5
//Output:
// 5 4 3 2 1 2 3 4 5
//   4 3 2 1 2 3 4
//     3 2 1 2 3
//       2 1 2
//         1