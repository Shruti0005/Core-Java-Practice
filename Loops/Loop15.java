package Loops;

import java.util.Scanner;

public class Loop15 {
    public static void main(String[] args) {
        //WAP TO PRINT PRODUCT OF EVEN NUMBRS BETWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int product = 1;
        for(int i = m; i <= n; i++){
            if(i % 2 == 0)
            product = product * i;
        }
        System.out.println(product);
        sc.close();
    }
}
