package Loops;

import java.util.Scanner;

public class ArmsrongNum {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER GIVEN NUMBER IS ARMSTONG NUMBER OR NOT ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (num > 0) {
            count++;
            num = num/10;
        }
        num = temp;
        int sum = 0;
        while (num > 0) {
            int rev = num % 10;
            int product = 1;
            for(int i = 1; i <= count; i++){
                product = product * rev;
            }
            sum = sum + product;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("It is a Armstrong Number");
        }
        else{
            System.out.println("It is not a Armstrong Number");
        }
        sc.close();
    }
}
