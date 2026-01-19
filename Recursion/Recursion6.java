package Recursion;

import java.util.Scanner;

public class Recursion6 {
    public static void revDigit(int n){
        //Base case
        if(n == 0){
            return;
        }

        System.out.println(n%10);

        //Recursive call
        revDigit(n/10);
    }
    public static void main(String[] args) {
        //Print reverse digit 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        revDigit(num);
        sc.close();
    }
}
