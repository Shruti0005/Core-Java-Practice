package Loops;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        //WAP TO PRINT NATURAL B/W M AND N ?
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i <= n; i++){
            System.out.println(i);
        }
        sc.close();
    }
}
