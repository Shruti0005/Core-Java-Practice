package Loops;

import java.util.Scanner;

public class Loop36 {
    public static void main(String[] args) {
        //WAP TO PRINT HOW MANY NUMBERS HAVE 6 IN IT AND HOW MANY 6'S ARE PRESENT ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        for(int i = m; i <= n; i++){
            int t = i;
            boolean has6 = false;
            while (t > 0) {
                int r = t % 10;
                if (r == 6) {
                    count++;
                    has6 = true;
                }
                t = t/10;
            }
            if (!has6) {
                System.out.println(i);
            }
        }
        System.out.println("Counts of 6 in it = "+count);
        sc.close();
    }
}
