package Loops;

import java.util.Scanner;

public class PrintArmstrongSeries {
    public static void main(String[] args) {
        //WAP TO PRINT ARMSTRONG NUMBERS BEWEEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            int t = i;
            int count = 0;
            while (t > 0) {
                count++;
                t = t/10;
            }
            int t1 = i;
            int sum = 0;
            while (t1 > 0) {
                int rev = t1 % 10;
                int product = 1;
                for(int j = 1; j <= count; j++){
                    product = product * rev;
                }
                sum = sum + product;
                t1 = t1/10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
