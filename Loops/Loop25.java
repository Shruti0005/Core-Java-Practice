package Loops;

import java.util.Scanner;

public class Loop25 {
    public static void main(String[] args) {
        //WAP TO COUNT DIGITS PRESENT IN A NUMBER ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        System.out.println(count);
        sc.close();
    }
}
