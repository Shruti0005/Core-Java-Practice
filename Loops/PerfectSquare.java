package Loops;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER GIVEN NUMBER IS A PERFECT SQUARE OR NOT ? e.g. 1, 4, 9, 16, 25 is perfect square
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean check = false;
        for(int i = 1; i <= num; i++){
            if (i * i == num) {
                check = true;
            }
        }
        if (check) {
            System.out.println("It is a Perfect Square");
        }
        else{
            System.out.println("It is not a Perfect Square");
        }
        sc.close();
    }
}
