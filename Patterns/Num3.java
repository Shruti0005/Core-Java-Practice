package Patterns;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {
        //print 1 to 9  after 9 start from 1 again in squar pattern
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++) {
                if (n > 9) {
                    n = 1;   
                }
                System.out.print(n++ + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
