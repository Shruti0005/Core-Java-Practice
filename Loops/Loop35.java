package Loops;

import java.util.Scanner;

public class Loop35 {
    public static void main(String[] args) {
        //WAP TO COUNT HOW MANY 3 ARE PRESENT IN BETWEN M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for(int i = m; i <= n; i++){
            int t = i;
            while (t > 0) {
                int r = t % 10;
                if (r == 3) {
                    count++;
                }
                t = t/10;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
