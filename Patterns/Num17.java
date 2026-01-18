package Patterns;

import java.util.Scanner;

public class Num17 {
    public static void main(String[] args) {
        //Print number increasing way in cross pattern
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == j || i+j == num+1) {
                    System.out.print(j+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
//intput: 5
//Output:
// 1       5 
//   2   4
//     3
//   2   4
// 1       5