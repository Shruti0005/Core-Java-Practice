package Loops;

import java.util.Scanner;

public class Loop16 {
    public static void main(String[] args) {
        //WAP TO PRINT SUMMATION OF THE NATURAL NUMBERS BETWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = m; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
