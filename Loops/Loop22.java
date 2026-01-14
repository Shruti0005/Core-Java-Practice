package Loops;

import java.util.Scanner;

public class Loop22 {
    public static void main(String[] args) {
        //WAP TO PRINT SUMMATION OF THE NUMBERS WHICH ARE DIVISABLE BY 5 BETWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = m; i <= n; i++){
            if (i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
