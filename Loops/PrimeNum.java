package Loops;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER GIVEN NUMBER IS PRIME NUMBER OR NOT ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++){
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is a Prime Number");
        }
        else{
            System.out.println("It is not a Prime Number");
        }
        sc.close();
    }
}
