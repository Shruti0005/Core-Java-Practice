package Loops;

import java.util.Scanner;

public class Loop20 {
    public static void main(String[] args) {
        //WAP TO PRINT ENTERED NUMBER IS DIVISBLE BY 7 OR NOT ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
