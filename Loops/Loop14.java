package Loops;

import java.util.Scanner;

public class Loop14 {
    public static void main(String[] args) {
        //WAP TO PRINT SUMMATION OF ODD NUMBERS BETWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for(int i = m; i <= n; i++){
            if(i % 2 != 0)
                sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}
