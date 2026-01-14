package Loops;

import java.util.Scanner;

public class Loop38 {
    public static void main(String[] args) {
        //Find numbers index even or odd and print e.g. i/p = 12345 o/p = even: 135, odd: 24
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        int count = 0;
        while (num > 0) {
            int r = num % 10;
            count++;
            res = res * 10 + r;
            num = num / 10;
        }
        String even = "";
        String odd = "";
        for (int i = 0; i < count; i++) {
            int r = res % 10;
            if (i % 2 == 0) {
                even = even + r;
            }
            else{
                odd = odd + r;
            }
            res = res / 10;
        }
        System.out.println("Even: "+ even + "\nOdd: "+ odd);
        sc.close();
    }
}
