package Loops;

import java.util.Scanner;

public class Loop32 {
    public static void main(String[] args) {
        //WAP TO CHECK WHETHER PRODUCT OF THE NUMBER IS EVEN OR ODD ?
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int product = 1;
        while (num > 0) {
            int res = num % 10;
            product = product * res;
            num = num / 10;
        }
        if (product % 2 == 0) {
            System.out.println(product + " is a even number");
        }
        else{
            System.out.println(product + " is a odd number");
        }
        sc.close();
    }
}
