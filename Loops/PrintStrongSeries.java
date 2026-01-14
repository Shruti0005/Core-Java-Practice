package Loops;

import java.util.Scanner;

public class PrintStrongSeries {
    public static void main(String[] args) {
        //WAP TO PRINT STRONG NUMBERS BEWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int t = i;
            int sum = 0;
            while (t > 0) {
                int rev = t % 10;
                int product = 1;
                for (int j = 1; j <= rev; j++) {
                    product = product * j;
                }
                sum = sum + product;
                t = t / 10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
