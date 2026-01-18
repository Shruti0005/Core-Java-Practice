package Patterns;

import java.util.Scanner;

public class Num11 {
    public static void main(String[] args) {
        //print palindrome number reverse triangle pattern
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            //print space
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            //print increasing space
            for (int j = num; j >= i; j--) {
                System.out.print((num+1)-j +" ");
            }

            for (int j = 1; j <= num-i; j++) {
                System.out.print(num-i+1-j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//Input: 4
//Output:
// 1 2 3 4 3 2 1 
//   1 2 3 2 1
//     1 2 1
//       1