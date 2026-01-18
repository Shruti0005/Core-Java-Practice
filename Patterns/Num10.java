package Patterns;

import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        //print palindrome number triangle pattern
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            //print space
            for (int j = num-1; j >= i; j--) {
                System.out.print("  ");
            }
            //print increasing numbers
            for (int j = 1; j <= i; j++) {
               System.out.print(j+" ");
            }
            //print decreasing numbers
            for (int j = i-1; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//Input: 4
//Output:
//       1 
//     1 2 1 
//   1 2 3 2 1 
// 1 2 3 4 3 2 1 