package Loops;

import java.util.Scanner;

public class Loop19 {
    public static void main(String[] args) {
        //WAP TO PRINT TABLE WITHOUT USING MULTIPLICATION OPERATOR ?
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        int res = 0;
        for(int i = 1; i <= 10; i++){
            res = res + in;
            System.out.println(res);
        }
        sc.close();
    }
}
