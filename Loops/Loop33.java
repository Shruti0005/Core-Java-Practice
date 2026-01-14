package Loops;

import java.util.Scanner;

public class Loop33 {
    public static void main(String[] args) {
        //WAP TO PRINT NUMBERS BETWEEN M AND N EXCEPT THE NUMBER WHICH HAS 7 IN IT ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i<=n; i++){
            int t = i;
            boolean has7 = false;
            while (t > 0) {
                int r = t % 10;
                if (r == 7) { 
                    has7 = true;
                }
                t=t/10;
            }
            if (!has7)
            System.out.println(i);
        }
        sc.close();
    }
}
