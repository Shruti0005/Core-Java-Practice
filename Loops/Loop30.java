package Loops;

import java.util.Scanner;

public class Loop30 {
    public static void main(String[] args) {
        //WAP TO PRINT THE SUMMATIOM OF THE NUMBER ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int res = num % 10;
            sum = sum + res;
            num = num/10;
        }
        System.out.println(sum);
        sc.close();
    }
}
