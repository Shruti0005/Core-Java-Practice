package Recursion;

import java.util.Scanner;

public class Recursion1 {
    public static void printNumbeer(int n){
        //Base case
        if (n == 0) {
            return;
        }

        //recursive call
        printNumbeer(n-1);

        //work after recursion
        System.out.println(n);
    }
    public static void main(String[] args) {
        //Print number upto given value while increasing
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNumbeer(num);
        sc.close();
    }
}
