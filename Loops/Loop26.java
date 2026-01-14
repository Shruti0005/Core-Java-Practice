package Loops;

import java.util.Scanner;

public class Loop26 {
    public static void main(String[] args) {
        //WAP TO REVERSING A NUMBER ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int res = num % 10;
            rev = (rev * 10) + res;
            num = num / 10;
        }
        System.out.println(rev);
        sc.close();
    }
}
