package Loops;

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER GIVEN NUMBER IS STRONG NUMBER OR NOT ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rev = num % 10;
            int product = 1;
            for (int i = 1; i <= rev; i++) {
                product = product * i;
            }
            sum = sum + product;
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("It is a Strong Number");
        }
        else{
            System.out.println("It is not a Strong Number");
        }
        sc.close();
    }
}
