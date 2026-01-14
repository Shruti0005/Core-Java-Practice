package Loops;

import java.util.Scanner;

public class Loop34 {
    public static void main(String[] args) {
        //WAP TO COUNT NUMBERS BETWEEN M AND N THE NUMBER WHICH HAS 5 IN IT ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for(int i = m; i <= n; i++){
            int t = i;
            while (t > 0) {
                int r = t % 10;
                if (r == 5) {
                    count++;
                }
                t = t/10;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
