package Loops;

import java.util.Scanner;

public class Loop27 {
    public static void main(String[] args) {
        //WAP TO PRINT THE DIGITS IN VETICALY ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num > 0) {
            int res = num % 10;
            System.out.println(res);
            num = num/10;
        }
        sc.close();
    }
}
