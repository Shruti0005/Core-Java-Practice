package Loops;

import java.util.Scanner;

public class Loop21 {
    public static void main(String[] args) {
        //WAP TO COUNT THE NUMBERS WHICCH ARE DIVISABLE BY 7 BETWEEN M AN N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for(int i = m; i <= n; i++){
            if (i % 7 == 0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
