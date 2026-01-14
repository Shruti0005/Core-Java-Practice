package Loops;

import java.util.Scanner;

public class Loop9 {
    public static void main(String[] args) {
        //WAP TO PRINT PRODUCT OF THE NATURAL NUMBERS BETWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int product = 1;
        for (int i = m; i <= n; i++) {
            product = product * i;
        }
        System.out.println(product);
        sc.close();
    }
}
