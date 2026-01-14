package Loops;

import java.util.Scanner;

public class FibinociiSeries {
    public static void main(String[] args) {
        //WAP TO PRINT FIBINOCII SERIES
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 
        int a = 0; 
        int b = 1;
        int sum = a + b;
        System.out.println(a+"\n"+b);
        for(int i = 1; i <= num; i++){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a + b;
        }
        sc.close();
    }
}
