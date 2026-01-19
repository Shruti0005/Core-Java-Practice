package Recursion;

import java.util.Scanner;

public class Recursion3 {
    public static int addNum(int n){
        //Base case
        if (n == 0) {
            return 0;
        }
        //Recursive call
        return n + addNum(n-1);
    }
    public static void main(String[] args) {
        //Print addition of upto given number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(addNum(num));
        sc.close();
    }
}
